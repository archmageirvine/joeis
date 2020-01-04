package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028363.
 * @author Sean A. Irvine
 */
public class A028363 implements Sequence {

  private int mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(Z.ONE.shiftLeft(4 * mN - 5).add(1))
        .multiply(Z.ONE.shiftLeft(4 * mN - 4).add(1))
        .multiply(Z.ONE.shiftLeft(4 * mN - 3).add(1))
        .multiply(Z.ONE.shiftLeft(4 * mN - 2).add(1));
    }
    return mA;
  }
}

