package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001076 Denominators of continued fraction convergents to sqrt(5).
 * @author Sean A. Irvine
 */
public class A001076 implements Sequence {

  private Z mA = Z.valueOf(-4);
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z t = mB.shiftLeft(2).add(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

