package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031112 Position of n-th 0 in A031111.
 * @author Sean A. Irvine
 */
public class A031112 extends A031111 {

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

