package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031036 Position of n-th 0 in A031035.
 * @author Sean A. Irvine
 */
public class A031036 extends A031035 {

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

