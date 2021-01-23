package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031058 Position of n-th 0 in A031057.
 * @author Sean A. Irvine
 */
public class A031058 extends A031057 {

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

