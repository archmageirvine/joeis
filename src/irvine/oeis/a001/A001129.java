package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A001129 Iccanobif numbers: reverse digits of two previous terms and add.
 * @author Sean A. Irvine
 */
public class A001129 implements Sequence {

  private Z mA = Z.NEG_ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z t = mA.add(mB);
    mA = mB;
    mB = ZUtils.reverse(t);
    return t;
  }
}

