package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A014258 Iccanobif numbers: add previous two terms and reverse the sum.
 * @author Sean A. Irvine
 */
public class A014258 implements Sequence {

  private Z mA = Z.NEG_ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z n = ZUtils.reverse(mA.add(mB));
    mA = mB;
    mB = n;
    return n;
  }
}

