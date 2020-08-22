package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031075 Position of n-th 7 in A031067.
 * @author Sean A. Irvine
 */
public class A031075 extends A031067 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.SEVEN.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

