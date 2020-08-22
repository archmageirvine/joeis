package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031041 Position of n-th 5 in A031035.
 * @author Sean A. Irvine
 */
public class A031041 extends A031035 {

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

