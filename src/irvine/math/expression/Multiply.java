package irvine.math.expression;

/**
 * An expression for multiplication.
 * @author Sean A. Irvine
 */
public class Multiply extends AbstractLeftRightExpression {

  private static final MultiplyCollapser COLLAPSER = new MultiplyCollapser();

  /**
   * Create the multiplication of two expressions.
   * @param left first multiplicand
   * @param right second multiplicand
   * @return the resulting expression
   */
  public static Expression create(final Expression left, final Expression right) {
    final Expression expr = new Multiply(left.eval(), right.eval()).eval();
    if (expr instanceof Multiply) {
      return COLLAPSER.collapse(expr).eval();
    } else {
      return expr;
    }
  }

  Multiply(final Expression left, final Expression right) {
    super(left.complexity() <= right.complexity() ? left : right, left.complexity() <= right.complexity() ? right : left, " * ");
  }

  @Override
  public <T> Expression performEval() {
    final Expression left = left().eval();
    if (left.equals(LiteralZ.LIT_ZERO)) {
      return LiteralZ.LIT_ZERO;
    }
    final Expression right = right().eval();
    if (right.equals(LiteralZ.LIT_ZERO)) {
      return LiteralZ.LIT_ZERO;
    }
    if (left instanceof Literal<?, ?>) {
      final Literal<?, ?> leftLit = (Literal) left;
      if (leftLit.ring().zero().equals(leftLit.value())) {
        return left;
      }
      if (leftLit.ring().one().equals(leftLit.value())) {
        return right;
      }
    }
    if (right instanceof Literal<?, ?>) {
      final Literal<?, ?> rightLit = (Literal) right;
      if (rightLit.ring().zero().equals(rightLit.value())) {
        return right;
      }
      if (rightLit.ring().one().equals(rightLit.value())) {
        return left;
      }
    }
    if (left instanceof Literal<?, ?> && right instanceof Literal<?, ?>) {
      final Literal<?, ?> leftLit = (Literal) left;
      final Literal<?, ?> rightLit = (Literal) right;
      if (Coercion.isUpper(leftLit, rightLit)) {
        final Literal<T, ?> l = Coercion.force(leftLit);
        // The eval() below ensures things like 2 * (1/2) = 1 gives an integer rather than rational result
        return Literal.create(l.ring().multiply(l.value(), l.coerce(rightLit.value()))).eval();
      } else {
        final Literal<T, ?> r = Coercion.force(rightLit);
        return Literal.create(r.ring().multiply(r.coerce(leftLit.value()), r.value())).eval();
      }
    }
    // Transfer a negation to the literal, lit * -E -> (-lit) * E.
    // Note -E * lit, does not occur because of complexity ordering
    if (left instanceof Literal<?, ?> && right instanceof Negate) {
      return new Multiply(new Negate(left).eval(), ((Negate) right).arg()).eval();
    }
    if (right instanceof Divide && LiteralZ.LIT_ONE.equals(((Divide) right).left())) {
      return new Divide(left, ((Divide) right).right()).eval();
    }
    if (left == left() && right == right()) {
      return this;
    } else {
      return Multiply.create(left, right);
    }
  }

  @Override
  public Expression substitute(final Identifier var, final Expression value) {
    return Multiply.create(left().substitute(var, value), right().substitute(var, value));
  }

  @Override
  public Expression diff(final Identifier var) {
    // d(uv)/dv = u(dv/dx) + v(du/dx)
    final Expression u = left();
    final Expression v = right();
    final Expression left = Multiply.create(u, v.diff(var).eval()).eval();
    final Expression right = Multiply.create(v, u.diff(var).eval()).eval();
    return Add.create(left, right).eval();
  }

  @Override
  public Precedence precedence() {
    return Precedence.MULTIPLY;
  }

  @Override
  public Expression expand() {
    final Expression left = left().expand();
    final Expression right = right().expand();
    if (left instanceof Add) {
      return new Add(Multiply.create(((Add) left).left(), right).eval().expand(),
        Multiply.create(((Add) left).right(), right).eval().expand());
    }
    if (right instanceof Add) {
      return new Add(Multiply.create(left, ((Add) right).left()).eval().expand(),
        Multiply.create(left, ((Add) right).right()).eval().expand());
    }
    return super.expand();
  }
}
