package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001077 Numerators of continued fraction convergents to sqrt(5).
 * @author Sean A. Irvine
 */
public class A001077 extends Sequence0 {

  private Z mA = Z.NINE;
  private Z mB = Z.valueOf(-2);

  @Override
  public Z next() {
    final Z t = mB.shiftLeft(2).add(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

