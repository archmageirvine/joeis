package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031013 Position of n-th 5 in A031007.
 * @author Sean A. Irvine
 */
public class A031013 extends A031007 {

  private long mN = -1;

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

