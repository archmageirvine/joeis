package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031053 Position of n-th 7 in A031045.
 * @author Sean A. Irvine
 */
public class A031053 extends A031045 {

  private long mN = -1;

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

