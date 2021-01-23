package irvine.math.expression;

import irvine.math.z.Z;

/**
 * An expression for modulo.
 * @author Sean A. Irvine
 */
public class Modulo extends AbstractLeftRightExpression {

  /**
   * Construct the modulus of one expression by another
   * @param left number
   * @param right modulus
   */
  public Modulo(final Expression left, final Expression right) {
    super(left, right, "%");
  }

  private <T> Expression modulo(final Literal<T, ?> n, final Literal<T, ?> m) {
    if (n.value() instanceof Z && m.value() instanceof Z) {
      return new LiteralZ(((Z) n.value()).mod((Z) m.value()));
    }
    throw new UnsupportedOperationException();
  }

  @Override
  public <T> Expression performEval() {
    final Expression left = left().eval();
    final Expression right = right().eval();
    if (left instanceof Literal<?, ?> && right instanceof Literal<?, ?>) {
      final Literal<?, ?> rightLit = (Literal) right;
      if (rightLit.ring().zero().equals(rightLit.value())) {
        throw new ArithmeticException();
      }
      final Literal<?, ?> leftLit = (Literal) left;
      if (leftLit.ring().zero().equals(leftLit.value())) {
        return left;
      }
      if (Coercion.isUpper(leftLit, rightLit)) {
        final Literal<T, ?> l = Coercion.force(leftLit);
        return modulo(l, Coercion.force(rightLit)).eval();
      } else {
        final Literal<T, ?> r = Coercion.force(rightLit);
        return modulo(Coercion.force(leftLit), r).eval();
      }
    } else if (left == left() && right == right()) {
      return this;
    } else {
      return new Modulo(left, right);
    }
  }

  @Override
  public Expression substitute(final Identifier var, final Expression value) {
    return new Modulo(left().substitute(var, value), right().substitute(var, value));
  }

  @Override
  public Expression diff(final Identifier var) {
    throw new UnsupportedOperationException("derivative of modulo");
  }

  @Override
  public Precedence precedence() {
    return Precedence.MULTIPLY;
  }

  @Override
  public String toString() {
    return ExpressionUtils.toString(left()) + " (mod " + ExpressionUtils.toString(right()) + ")";
  }
}
