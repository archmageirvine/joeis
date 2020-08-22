package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031270 Position of n-th 0 in A031269.
 * @author Sean A. Irvine
 */
public class A031270 extends A031269 {

  private long mN = 0;

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

