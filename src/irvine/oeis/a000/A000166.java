package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000166.
 * @author Sean A. Irvine
 */
public class A000166 implements Sequence {

  protected int mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mA = mA.multiply(mN).add((mN & 1) == 0 ? 1 : -1);
    }
    return mA;
  }
}

