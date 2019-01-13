package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000854.
 * @author Sean A. Irvine
 */
public class A000854 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(3 * (1 << mN))
      .add(Z.ONE.shiftLeft(3 * (1 << (mN - 1))).multiply((1 << mN) - 1).multiply(20))
      .add(Z.ONE.shiftLeft((1 << mN) + 3))
      .add(Z.ONE.shiftLeft((1 << (mN - 1)) + 4).multiply((1 << mN) - 1))
      .add(Z.ONE.shiftLeft(1 << (mN + 1)).multiply(6))
      .shiftRight(mN)
      .divide(48);
  }
}

