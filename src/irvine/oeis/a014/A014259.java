package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A014259 Iccanobif numbers: add reversal of a(n-1) to a(n-2).
 * @author Sean A. Irvine
 */
public class A014259 extends Sequence0 {

  private Z mA = Z.NEG_ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z n = mA.add(ZUtils.reverse(mB));
    mA = mB;
    mB = n;
    return n;
  }
}

