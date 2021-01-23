package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031019 Position of n-th 0 in A031018.
 * @author Sean A. Irvine
 */
public class A031019 extends A031018 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

