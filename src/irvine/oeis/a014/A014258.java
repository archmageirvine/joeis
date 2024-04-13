package irvine.oeis.a014;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014258 Iccanobif numbers: add previous two terms and reverse the sum.
 * @author Sean A. Irvine
 */
public class A014258 extends Sequence0 {

  private Z mA = Z.NEG_ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z n = Functions.REVERSE.z(mA.add(mB));
    mA = mB;
    mB = n;
    return n;
  }
}

