package irvine.math.expression;

import irvine.math.api.Pow;
import irvine.math.api.Ring;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;

/**
 * An expression for powers.
 * @author Sean A. Irvine.
 */
public class Power extends AbstractLeftRightExpression {

  /**
   * Construct the power of the first number by a second.
   * @param n number to raise
   * @param power power
   */
  public Power(final Expression n, final Expression power) {
    super(n, power, "^");
  }

  @SuppressWarnings("unchecked")
  private <T> Expression pow(final Literal<T, ?> n, final Literal<T, ?> m) {
    final Ring<T> ring = n.ring();
    if (m instanceof LiteralZ && m.signum() < 0 && n instanceof LiteralZ) {
      // integer ^ -integer needs to promote up to Q
      return new LiteralQ(new Q(((LiteralZ) n).value()).pow(((LiteralZ) m).value().intValueExact()));
    }
    if (ring instanceof Pow) {
      return Literal.create(((Pow<T>) ring).pow(n.value(), m.value())).eval();
    }
    // rational ^ rational is not supported because it can go out of Q
    // However, rational ^ integer is an important case we can handle
    if (n.value() instanceof Q) {
      // m has been promoted to Q, but it might actually be an integer
      final Q p = (Q) m.value();
      if (p.isInteger()) {
        return new LiteralQ(Rationals.SINGLETON.pow((Q) n.value(), p.toZ().intValueExact())).eval();
      }
    }
    // There might be other important cases that can yet be implemented
//    if (m.value() instanceof Number) {
//      final long p = ((Number) m.value()).longValue();
//    }
    throw new UnsupportedOperationException(ring + " power");
  }

  @Override
  public <T> Expression performEval() {
    final Expression left = left().eval();
    final Expression right = right().eval();
    if (right instanceof Literal<?, ?>) {
      final Literal<?, ?> rightLit = (Literal) right;
      // x^0
      if (rightLit.ring().zero().equals(rightLit.value())) {
        return LiteralZ.LIT_ONE;
      }
      // x^1
      if (rightLit.ring().one().equals(rightLit.value())) {
        return left;
      }
    }
    if (left instanceof Literal<?, ?>) {
      final Literal<?, ?> leftLit = (Literal) left;
      // 0^n, 1^n
      if (leftLit.ring().zero().equals(leftLit.value()) || leftLit.ring().one().equals(leftLit.value())) {
        return left;
      }
    }
    if (left instanceof Literal<?, ?> && right instanceof Literal<?, ?>) {
      final Literal<?, ?> leftLit = (Literal) left;
      final Literal<?, ?> rightLit = (Literal) right;
      if (Coercion.isUpper(leftLit, rightLit)) {
        final Literal<T, ?> l = Coercion.force(leftLit);
        return pow(l, Coercion.force(Literal.create(l.coerce(rightLit.value())))).eval();
      } else {
        final Literal<T, ?> r = Coercion.force(rightLit);
        return pow(Coercion.force(Literal.create(r.coerce(leftLit.value()))), r).eval();
      }
    }
    if (left == left() && right == right()) {
      return this;
    } else {
      return new Power(left, right);
    }
  }

  @Override
  public Expression substitute(final Identifier var, final Expression value) {
    return new Power(left().substitute(var, value), right().substitute(var, value));
  }

  @Override
  public Expression diff(final Identifier var) {
    // d(u^v)/dx = vu^(v-1)(du/dx) + u^v ln(u) (dv/dx)
    final Expression u = left();
    final Expression v = right();
    final Expression du = u.diff(var).eval();
    final Expression dv = v.diff(var).eval();
    final Expression left;
    if (du.equals(LiteralZ.LIT_ZERO)) {
      left = LiteralZ.LIT_ZERO;
    } else {
      final Expression v1 = new Add(v, LiteralZ.LIT_NEG_ONE).eval();
      left = Multiply.create(Multiply.create(du, v).eval(), new Power(u, v1).eval()).eval();
    }
    final Expression right;
    if (dv.equals(LiteralZ.LIT_ZERO)) {
      right = LiteralZ.LIT_ZERO;
    } else {
      right = Multiply.create(Multiply.create(dv, this).eval(), new Logarithm(u).eval()).eval();
    }
    return Add.create(left, right).eval();
  }

  @Override
  public Precedence precedence() {
    return Precedence.POWER;
  }

  @Override
  public Expression expand() {
    if (right() instanceof LiteralZ && left() instanceof Add) {
      // Apply the binomial theorem
      final int n = ((LiteralZ) right()).value().intValueExact();
      if (n > 1) {
        final Expression a = ((Add) left()).left();
        final Expression b = ((Add) left()).right();
        Expression res = new Power(b, right()).eval();
        for (int k = 1; k <= n; ++k) {
          final Expression pa = new Power(a, new LiteralZ(k)).eval();
          final Expression pb = new Power(b, new LiteralZ(n - k)).eval();
          res = new Add(res, Multiply.create(new LiteralZ(Binomial.binomial(n, k)), Multiply.create(pa, pb)).eval());
        }
        return res;
      }
    }
    return super.expand();
  }
}
