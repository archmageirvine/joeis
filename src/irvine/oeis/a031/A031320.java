package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031320 Position of n-th 7 in A031312.
 * @author Sean A. Irvine
 */
public class A031320 extends A031312 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.SEVEN.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

