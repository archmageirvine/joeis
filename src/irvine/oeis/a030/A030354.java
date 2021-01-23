package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030354 Position of n-th 0 in A030353.
 * @author Sean A. Irvine
 */
public class A030354 extends A030353 {

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

