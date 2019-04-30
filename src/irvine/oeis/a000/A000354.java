package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000354 Expansion of e.g.f. <code>exp(-x)/(1-2*x)</code>.
 * @author Sean A. Irvine
 */
public class A000354 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    mA = mA.multiply(2 * mN).add((mN & 1) == 0 ? 1 : -1);
    return mA;
  }
}
