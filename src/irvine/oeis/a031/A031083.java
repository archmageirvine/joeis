package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031083 Position of n-th 6 in A031076.
 * @author Sean A. Irvine
 */
public class A031083 extends A031076 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.SIX.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

