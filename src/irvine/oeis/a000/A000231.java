package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000231 Number of inequivalent Boolean functions of n variables under action of complementing group.
 * @author Sean A. Irvine
 */
public class A000231 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.TWO : Z.ONE.shiftLeft(1 << mN)
      .add(Z.ONE.shiftLeft(mN).subtract(Z.ONE).multiply(Z.ONE.shiftLeft(1 << (mN - 1))))
      .shiftRight(mN);
  }
}

