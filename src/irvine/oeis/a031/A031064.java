package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031064 Position of n-th 6 in A031057.
 * @author Sean A. Irvine
 */
public class A031064 extends A031057 {

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

