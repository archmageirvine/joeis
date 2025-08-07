package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A386552 Concatenate powers of 10.
 * @author Sean A. Irvine
 */
public class A386552 extends Sequence0 {

  private Z mA = Z.ZERO;
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    final Z t = mN;
    mN = mN.multiply(10);
    mA = mA.multiply(mN).add(t);
    return mA;
  }
}

