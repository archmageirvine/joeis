package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A017927 Powers of sqrt(7) rounded up.
 * @author Sean A. Irvine
 */
public class A017927 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(7);
    final Z[] s = mN.sqrtAndRemainder();
    return s[0].add(s[1].isZero() ? 0 : 1);
  }
}

