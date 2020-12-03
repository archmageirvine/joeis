package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030999 Position of n-th 0 in A030998.
 * @author Sean A. Irvine
 */
public class A030999 extends A030998 {

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

