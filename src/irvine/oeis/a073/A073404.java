package irvine.oeis.a073;

import irvine.math.z.Z;

/**
 * A073404 Coefficient triangle of polynomials (falling powers) related to convolutions of A002605(n), n&gt;=0, (generalized (2,2)-Fibonacci). Companion triangle is A073403.
 * @author Sean A. Irvine
 */
public class A073404 extends A073403 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mQ.get(mN).coeff(mN - mM);
  }
}

