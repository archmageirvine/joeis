package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031084 Position of n-th 7 in A031076.
 * @author Sean A. Irvine
 */
public class A031084 extends A031076 {

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

