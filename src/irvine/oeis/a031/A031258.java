package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031258 Position of n-th 4 in A031253.
 * @author Sean A. Irvine
 */
public class A031258 extends A031253 {

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

