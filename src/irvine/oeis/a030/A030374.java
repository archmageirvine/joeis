package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030374 Position of n-th 0 in A030373.
 * @author Sean A. Irvine
 */
public class A030374 extends A030373 {

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

