package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031107 Position of n-th 6 in A031100.
 * @author Sean A. Irvine
 */
public class A031107 extends A031100 {

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

