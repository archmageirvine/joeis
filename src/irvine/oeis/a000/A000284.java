package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000284.
 * @author Sean A. Irvine
 */
public class A000284 implements Sequence {

  private Z mA = Z.NEG_ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z t = mB.pow(3).add(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
