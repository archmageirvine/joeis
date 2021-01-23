package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031109 Position of n-th 8 in A031100.
 * @author Sean A. Irvine
 */
public class A031109 extends A031100 {

  private long mN = 0;

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

