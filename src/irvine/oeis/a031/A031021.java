package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031021 Position of n-th 2 in A031018.
 * @author Sean A. Irvine
 */
public class A031021 extends A031018 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.TWO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

