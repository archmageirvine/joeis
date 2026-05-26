package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085023 E.g.f. satisfies exp(x*Sum_{n&gt;=0} floor(a(n)/n!)*x^n) = Sum_{n&gt;=0} a(n)*x^n/n!.
 * @author Sean A. Irvine
 */
public class A085023 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mA.add(Q.ONE);
      return Z.ONE;
    }
    mA.add(Q.valueOf(RING.exp(mA.shift(1), mN).coeff(mN).floor()));
    return RING.exp(mA.shift(1), mN).coeff(mN).multiply(Functions.FACTORIAL.z(mN)).floor();
  }
}
