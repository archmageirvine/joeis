package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038399.
 * @author Sean A. Irvine
 */
public class A038399 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.ZERO;
  private String mC = "";

  @Override
  public Z next() {
    final Z t = mA.add(mB);
    mA = mB;
    mB = t;
    mC = t + mC;
    return new Z(mC);
  }

}

