package irvine.oeis.a073;

import irvine.math.z.Z;

/**
 * A073401 Coefficient triangle of polynomials (rising powers) related to convolutions of A001045(n+1), n &gt;= 0, (generalized (1,2)-Fibonacci). Companion triangle is A073402.
 * @author Sean A. Irvine
 */
public class A073401 extends A073399 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mP.get(mN).coeff(mM);
  }
}

