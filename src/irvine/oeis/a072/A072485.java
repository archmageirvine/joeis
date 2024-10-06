package irvine.oeis.a072;

import irvine.math.z.Z;

/**
 * A072485 n-th number that includes the substring [n] in its decimal expansion.
 * @author Sean A. Irvine
 */
public class A072485 extends A072484 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}

