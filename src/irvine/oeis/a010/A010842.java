package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010842 Expansion of e.g.f.: exp(2*x)/(1-x).
 * @author Sean A. Irvine
 */
public class A010842 implements Sequence {

  private int mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(mN).add(Z.ONE.shiftLeft(mN));
    }
    return mA;
  }
}
