package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030342 Position of n-th 0 in A030341.
 * @author Sean A. Irvine
 */
public class A030342 extends A030341 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ZERO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

