package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031308 Position of n-th 9 in A031298.
 * @author Sean A. Irvine
 */
public class A031308 extends A031298 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.NINE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

