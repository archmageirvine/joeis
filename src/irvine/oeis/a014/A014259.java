package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A014259.
 * @author Sean A. Irvine
 */
public class A014259 implements Sequence {

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

