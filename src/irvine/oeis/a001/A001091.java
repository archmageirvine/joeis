package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001091.
 * @author Sean A. Irvine
 */
public class A001091 implements Sequence {

  private Z mA = Z.valueOf(31);
  private Z mB = Z.FOUR;

  @Override
  public Z next() {
    final Z t = mB.shiftLeft(3).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

