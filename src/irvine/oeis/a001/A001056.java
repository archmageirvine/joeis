package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001056.
 * @author Sean A. Irvine
 */
public class A001056 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB = Z.TWO;

  @Override
  public Z next() {
    final Z t = mA.multiply(mB).add(1);
    mA = mB;
    mB = t;
    return t;
  }
}
