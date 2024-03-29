package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A017936 Smallest number whose square has n digits.
 * @author Sean A. Irvine
 */
public class A017936 extends Sequence1 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(10);
    final Z[] s = mN.sqrtAndRemainder();
    return s[0].add(s[1].isZero() ? 0 : 1);
  }
}

