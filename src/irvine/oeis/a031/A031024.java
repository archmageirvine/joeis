package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031024 Position of n-th 5 in A031018.
 * @author Sean A. Irvine
 */
public class A031024 extends A031018 {

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

