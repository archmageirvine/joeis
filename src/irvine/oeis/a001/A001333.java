package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001333 Pell-Lucas numbers: numerators of continued fraction convergents to sqrt(2).
 * @author Sean A. Irvine
 */
public class A001333 extends Sequence0 {

  private Z mA = Z.THREE;
  private Z mB = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mB.multiply2().add(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
