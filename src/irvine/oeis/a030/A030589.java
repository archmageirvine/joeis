package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030589 Position of n-th 0 in A030588.
 * @author Sean A. Irvine
 */
public class A030589 extends A030588 {

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

