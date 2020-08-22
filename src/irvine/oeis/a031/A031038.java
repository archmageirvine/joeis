package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031038 Position of n-th 2 in A031035.
 * @author Sean A. Irvine
 */
public class A031038 extends A031035 {

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

