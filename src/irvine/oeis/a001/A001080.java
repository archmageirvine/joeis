package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001080.
 * @author Sean A. Irvine
 */
public class A001080 implements Sequence {

  private Z mA = Z.valueOf(-48);
  private Z mB = Z.valueOf(-3);

  @Override
  public Z next() {
    final Z t = mB.shiftLeft(4).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

