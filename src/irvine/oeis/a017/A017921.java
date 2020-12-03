package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017921 Powers of sqrt(5) rounded up.
 * @author Sean A. Irvine
 */
public class A017921 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(5);
    final Z[] s = mN.sqrtAndRemainder();
    return s[0].add(s[1].isZero() ? 0 : 1);
  }
}

