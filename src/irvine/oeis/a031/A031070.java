package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031070 Position of n-th 2 in A031067.
 * @author Sean A. Irvine
 */
public class A031070 extends A031067 {

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

