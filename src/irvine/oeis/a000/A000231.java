package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000231 Number of inequivalent Boolean functions of n variables under action of complementing group.
 * @author Sean A. Irvine
 */
public class A000231 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(1 << mN)
      .add(Z.ONE.shiftLeft(mN).subtract(Z.ONE).multiply(Z.ONE.shiftLeft(1 << (mN - 1))))
      .shiftRight(mN);
  }

}

