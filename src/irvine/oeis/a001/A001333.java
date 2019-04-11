package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001333 Numerators of continued fraction convergents to <code>sqrt(2)</code>.
 * @author Sean A. Irvine
 */
public class A001333 implements Sequence {

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
