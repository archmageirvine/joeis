package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001053.
 * @author Sean A. Irvine
 */
public class A001053 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;
  private long mN = -2;

  @Override
  public Z next() {
    final Z t = mA.multiply(++mN).add(mB);
    mB = mA;
    mA = t;
    return t;
  }
}
