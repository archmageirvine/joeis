package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001046.
 * @author Sean A. Irvine
 */
public class A001046 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    final Z t = mB.multiply(mN).multiply(++mN).divide(2).add(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
