package irvine.math.expression;

import irvine.math.api.Field;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * An expression for division.
 * @author Sean A. Irvine.
 */
public class Divide extends AbstractLeftRightExpression {

  private static final MultiplyCollapser COLLAPSER = new MultiplyCollapser();

  /**
   * Construct the division of one expression by another
   * @param left dividend
   * @param right divisor
   * @return the resulting expression
   */
  public static Expression create(final Expression left, final Expression right) {
    final Expression expr = new Divide(left.eval(), right.eval()).eval();
    if (expr instanceof Divide) {
      return COLLAPSER.collapse(expr).eval();
    } else {
      return expr;
    }
  }

  Divide(final Expression left, final Expression right) {
    super(left, right, " / ");
  }

  private <T> Expression divide(final Literal<?, ?> dividend, final Literal<?, ?> divisor) {
    if (dividend.ring() instanceof Field) {
      if (Coercion.isUpper(dividend, divisor)) {
        final Literal<T, ?> d = Coercion.force(dividend);
        return Literal.create(((Field<T>) d.ring()).divide(d.value(), d.coerce(divisor.value()))).eval();
      } else {
        final Literal<T, ?> d = Coercion.force(divisor);
        return Literal.create(((Field<T>) d.ring()).divide(d.coerce(dividend.value()), d.value())).eval();
      }
    }
    if (dividend.value() instanceof Z) {
      return new LiteralQ(new Q((Z) dividend.value(), (Z) divisor.value())).eval();
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public <T> Expression performEval() {
    final Expression left = left().eval();
    final Expression right = right().eval();
    if (right instanceof Literal<?, ?>) {
      final Literal<?, ?> rightLit = (Literal) right;
      if (rightLit.ring().zero().equals(rightLit.value())) {
        throw new ArithmeticException();
      }
      if (rightLit.ring().one().equals(rightLit.value())) {
        return left;
      }
    }
    // x / x
    if (left.equals(right)) {
      return LiteralZ.LIT_ONE;
    }
    // 0 / x
    if (left.equals(LiteralZ.LIT_ZERO)) {
      return LiteralZ.LIT_ZERO;
    }
    if (left instanceof Literal<?, ?> && right instanceof Literal<?, ?>) {
      final Literal<?, ?> leftLit = (Literal) left;
      if (leftLit.ring().zero().equals(leftLit.value())) {
        return left;
      }
      final Literal<?, ?> rightLit = (Literal) right;
      if (Coercion.isUpper(leftLit, rightLit)) {
        final Literal<T, ?> l = Coercion.force(leftLit);
        return divide(l, Coercion.force(rightLit)).eval();
      } else {
        final Literal<T, ?> r = Coercion.force(rightLit);
        return divide(Coercion.force(leftLit), r).eval();
      }
    }
    if (left instanceof Power) {
      final Power d = (Power) left;
      final Expression dleft = d.left();
      if (dleft.equals(right())) {
        // x^n / x -> x^(n-1)
        return new Power(right(), Subtract.create(d.right(), LiteralZ.LIT_ONE).eval()).eval();
      }
    }
    if (left == left() && right == right()) {
      return this;
    } else {
      return new Divide(left, right);
    }
  }

  @Override
  public Expression substitute(final Identifier var, final Expression value) {
    return new Divide(left().substitute(var, value), right().substitute(var, value));
  }

  @Override
  public Expression diff(final Identifier var) {
    // d(u/v)/dx = (v(du/dx)-u(dv/dx))/v^2
    final Expression u = left();
    final Expression v = right();
    final Expression left = Multiply.create(v, u.diff(var).eval()).eval();
    final Expression right = Multiply.create(u, v.diff(var).eval()).eval();
    final Expression v2 = new Power(v, LiteralZ.LIT_TWO).eval();
    return new Divide(Subtract.create(left, right).eval(), v2).eval();
  }

  @Override
  public Precedence precedence() {
    return Precedence.MULTIPLY;
  }
}
