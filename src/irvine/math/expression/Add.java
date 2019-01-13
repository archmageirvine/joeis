package irvine.math.expression;

/**
 * An expression for addition.
 * @author Sean A. Irvine.
 */
public class Add extends AbstractLeftRightExpression {

  private static final AddCollapser COLLAPSER = new AddCollapser();

  /**
   * Construct the addition of two expressions.
   * @param left first addend
   * @param right second addend
   * @return the resulting expression
   */
  public static Expression create(final Expression left, final Expression right) {
    final Expression expr = new Add(left.eval(), right.eval()).eval();
    if (expr instanceof Add) {
      return COLLAPSER.collapse(expr).eval();
    } else {
      return expr;
    }
  }

  /**
   * Construct the addition of expressions.
   * @param expr expression to be added
   * @return the resulting expression
   */
  public static Expression create(final Expression... expr) {
    if (expr.length < 1) {
      throw new IllegalArgumentException();
    }
    Expression res = expr[0];
    for (int k = 1; k < expr.length; ++k) {
      res = new Add(res, expr[k]);
    }
    return COLLAPSER.collapse(res).eval();
  }

  Add(final Expression left, final Expression right) {
    super(left.complexity() <= right.complexity() ? left : right, left.complexity() <= right.complexity() ? right : left, " + ");
  }

  @Override
  public <T> Expression performEval() {
    final Expression left = left().eval();
    final Expression right = right().eval();
    if (left instanceof Literal<?, ?>) {
      final Literal<?, ?> leftLit = (Literal) left;
      if (leftLit.ring().zero().equals(leftLit.value())) {
        return right;
      }
    }
    if (right instanceof Literal<?, ?>) {
      final Literal<?, ?> rightLit = (Literal) right;
      if (rightLit.ring().zero().equals(rightLit.value())) {
        return left;
      }
    }
    if (left instanceof Literal<?, ?> && right instanceof Literal<?, ?>) {
      final Literal<?, ?> leftLit = (Literal) left;
      final Literal<?, ?> rightLit = (Literal) right;
      if (Coercion.isUpper(leftLit, rightLit)) {
        final Literal<T, ?> l = Coercion.force(leftLit);
        return Literal.create(l.ring().add(l.value(), l.coerce(rightLit.value()))).eval();
      } else {
        final Literal<T, ?> r = Coercion.force(rightLit);
        return Literal.create(r.ring().add(r.coerce(leftLit.value()), r.value())).eval();
      }
    }
    // x + (-x)
    if (right instanceof Negate && left.equals(((Negate) right).arg())) {
      return LiteralZ.LIT_ZERO;
    }
    // (-x) + x
    if (left instanceof Negate && right.equals(((Negate) left).arg())) {
      return LiteralZ.LIT_ZERO;
    }
    // Rewrite A + (A * B) -> A * (B + 1), A + (B * A) -> A * (B + 1)
    if (right instanceof Multiply) {
      final Multiply m = (Multiply) right;
      if (m.left().equals(left)) {
        return Multiply.create(left, Add.create(m.right(), LiteralZ.LIT_ONE).eval()).eval();
      } else if (m.right().equals(left)) {
        return Multiply.create(left, Add.create(m.left(), LiteralZ.LIT_ONE).eval()).eval();
      }
    }
    // Rewrite (A * B) + A -> A * (B + 1)
    if (left instanceof Multiply) {
      final Multiply m = (Multiply) left;
      if (m.left().equals(right)) {
        return Multiply.create(right, Add.create(m.right(), LiteralZ.LIT_ONE).eval()).eval();
      } else if (m.right().equals(right)) {
        return Multiply.create(right, Add.create(m.left(), LiteralZ.LIT_ONE).eval()).eval();
      }
    }
    if (left == left() && right == right()) {
      return this;
    } else {
      return new Add(left, right);
    }
  }

  @Override
  public Expression substitute(final Identifier var, final Expression value) {
    return new Add(left().substitute(var, value), right().substitute(var, value));
  }

  @Override
  public Expression diff(final Identifier var) {
    return Add.create(left().diff(var).eval(), right().diff(var).eval()).eval();
  }

  @Override
  public Precedence precedence() {
    return Precedence.ADD;
  }

  @Override
  public String toString() {
    // Twist and simplify additions which are actually subtractions
    if (right() instanceof Negate || (right() instanceof Literal<?, ?> && ((Literal<?, ?>) right()).signum() < 0)) {
      final Expression right = new Negate(right()).eval();
      return ExpressionUtils.toString(left(), precedence()) + " - " + ExpressionUtils.toString(right, precedence());
    }
    if (left() instanceof Negate || (left() instanceof Literal<?, ?> && ((Literal<?, ?>) left()).signum() < 0)) {
      final Expression left = new Negate(left()).eval();
      return ExpressionUtils.toString(right(), precedence()) + " - " + ExpressionUtils.toString(left, precedence());
    }
    return super.toString();
  }

}
