package irvine.oeis.a014;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014260 Iccanobif numbers: add a(n-1) to reversal of a(n-2).
 * @author Sean A. Irvine
 */
public class A014260 extends Sequence0 {

  private Z mA = Z.NEG_ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z n = Functions.REVERSE.z(mA).add(mB);
    mA = mB;
    mB = n;
    return n;
  }
}

