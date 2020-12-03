package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031313 Position of n-th 0 in A031312.
 * @author Sean A. Irvine
 */
public class A031313 extends A031312 {

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

