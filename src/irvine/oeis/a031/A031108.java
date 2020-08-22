package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031108 Position of n-th 7 in A031100.
 * @author Sean A. Irvine
 */
public class A031108 extends A031100 {

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

