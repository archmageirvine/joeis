package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017220 a(n) = (9*n + 4)^12.
 * @author Sean A. Irvine
 */
public class A017220 implements Sequence {

  private Z mN = Z.valueOf(-5);

  @Override
  public Z next() {
    mN = mN.add(9);
    return mN.pow(12);
  }
}

