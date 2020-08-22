package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031116 Position of n-th 4 in A031111.
 * @author Sean A. Irvine
 */
public class A031116 extends A031111 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.FOUR.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

