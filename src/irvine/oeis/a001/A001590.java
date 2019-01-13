package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001590.
 * @author Sean A. Irvine
 */
public class A001590 implements Sequence {

  private Z mA = Z.NEG_ONE;
  private Z mB = Z.TWO;
  private Z mC = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mA.add(mB).add(mC);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
