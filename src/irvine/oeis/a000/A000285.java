package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000285.
 * @author Sean A. Irvine
 */
public class A000285 implements Sequence {

  private Z mA = Z.TWO.negate();
  private Z mB = Z.THREE;

  @Override
  public Z next() {
    final Z t = mA.add(mB);
    mA = mB;
    mB = t;
    return t;
  }
}
