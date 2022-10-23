package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000354 Expansion of e.g.f. exp(-x)/(1-2*x).
 * @author Sean A. Irvine
 */
public class A000354 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    mA = mA.multiply(2 * mN).add((mN & 1) == 0 ? 1 : -1);
    return mA;
  }
}
