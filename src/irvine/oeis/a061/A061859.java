package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061859 Differences between the ordinary multiplication table A004247 and Xmult table A048720, computed for {3..n} * {3..n}.
 * @author Sean A. Irvine
 */
public class A061859 extends A061858 {

  private long mN = 1;
  private long mM = 0;

  {
    for (int k = 0; k < 24; ++k) {
      super.next();
    }
  }

  @Override
  public Z next() {
    while (++mM > mN) {
      ++mN;
      for (int k = 0; k < 6; ++k) {
        super.next();
      }
      mM = 0;
    }
    return super.next();
  }
}
