package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017951 Powers of sqrt(15) rounded up.
 * @author Sean A. Irvine
 */
public class A017951 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(15);
    final Z[] s = mN.sqrtAndRemainder();
    return s[0].add(s[1].isZero() ? 0 : 1);
  }
}

