package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031117 Position of n-th 5 in A031111.
 * @author Sean A. Irvine
 */
public class A031117 extends A031111 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.FIVE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

