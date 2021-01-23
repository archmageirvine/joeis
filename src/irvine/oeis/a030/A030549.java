package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030549 Position of n-th 0 in A030548.
 * @author Sean A. Irvine
 */
public class A030549 extends A030548 {

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

