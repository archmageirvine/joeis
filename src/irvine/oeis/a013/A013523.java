package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013523 Denominator of <code>[x^(2n+1)]</code> in the Taylor expansion <code>arcsinh(cosec(x) - cot(x))</code>.
 * @author Sean A. Irvine
 */
public class A013523 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  protected Z select(final Q n) {
    return n.den().shiftLeft(mN);
  }

  @Override
  public Z next() {
    mN += 2;
    return select(RING.log(RING.add(RING.tan(RING.x(), mN), RING.sec(RING.x(), mN)), mN).coeff(mN));
  }
}
