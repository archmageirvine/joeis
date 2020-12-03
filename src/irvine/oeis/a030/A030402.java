package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030402 Position of n-th 0 in A030401.
 * @author Sean A. Irvine
 */
public class A030402 extends A030401 {

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

