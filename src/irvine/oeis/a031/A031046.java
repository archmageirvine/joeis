package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031046 Position of n-th 0 in A031045.
 * @author Sean A. Irvine
 */
public class A031046 extends A031045 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ZERO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

