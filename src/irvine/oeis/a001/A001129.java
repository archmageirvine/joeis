package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001129 Iccanobif numbers: reverse digits of two previous terms and add.
 * @author Sean A. Irvine
 */
public class A001129 extends Sequence0 {

  private Z mA = Z.NEG_ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z t = mA.add(mB);
    mA = mB;
    mB = Functions.REVERSE.z(t);
    return t;
  }
}

