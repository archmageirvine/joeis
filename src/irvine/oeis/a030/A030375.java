package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030375 Position of n-th 1 in A030373.
 * @author Sean A. Irvine
 */
public class A030375 extends A030373 {

  private long mN = 0;

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

