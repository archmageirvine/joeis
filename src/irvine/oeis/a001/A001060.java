package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001060.
 * @author Sean A. Irvine
 */
public class A001060 implements Sequence {

  private Z mA = Z.NEG_ONE;
  private Z mB = Z.THREE;

  @Override
  public Z next() {
    final Z t = mA.add(mB);
    mA = mB;
    mB = t;
    return t;
  }
}
