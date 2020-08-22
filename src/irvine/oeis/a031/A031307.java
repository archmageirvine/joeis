package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031307 Position of n-th 8 in A031298.
 * @author Sean A. Irvine
 */
public class A031307 extends A031298 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.EIGHT.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

