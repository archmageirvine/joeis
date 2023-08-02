package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028363 Total number of doubly-even self-dual binary codes of length 8n.
 * @author Sean A. Irvine
 */
public class A028363 extends Sequence0 {

  private int mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(Z.ONE.shiftLeft(4L * mN - 5).add(1))
        .multiply(Z.ONE.shiftLeft(4L * mN - 4).add(1))
        .multiply(Z.ONE.shiftLeft(4L * mN - 3).add(1))
        .multiply(Z.ONE.shiftLeft(4L * mN - 2).add(1));
    }
    return mA;
  }
}

