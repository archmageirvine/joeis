package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031089 Position of n-th 1 in A031087.
 * @author Sean A. Irvine
 */
public class A031089 extends A031087 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ONE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

