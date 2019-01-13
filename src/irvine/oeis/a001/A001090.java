package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001090.
 * @author Sean A. Irvine
 */
public class A001090 implements Sequence {

  private Z mA = Z.valueOf(-8);
  private Z mB = Z.valueOf(-1);

  @Override
  public Z next() {
    final Z t = mB.shiftLeft(3).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

