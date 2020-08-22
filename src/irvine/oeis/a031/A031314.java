package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031314 Position of n-th 1 in A031312.
 * @author Sean A. Irvine
 */
public class A031314 extends A031312 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ONE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

