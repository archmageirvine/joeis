package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031088 Position of n-th 0 in A031087.
 * @author Sean A. Irvine
 */
public class A031088 extends A031087 {

  private long mN = -1;

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

