package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000350.
 * @author Sean A. Irvine
 */
public class A000350 extends A000045 {

  private long mN = -1;
  private long mM = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mN >= mM) {
        mM *= 10;
      }
      if (super.next().mod(mM) == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

