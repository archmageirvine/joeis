package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071764 Number of minimal rectangular envelopes (up to rotation) that enclose n contiguous squares.
 * @author Sean A. Irvine
 */
public class A071764 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 2) {
      mA = mA.add((mN + 1) / 2).subtract((Functions.SIGMA0.l(mN - 1) + 1) / 2);
    }
    return mA;
  }
}
