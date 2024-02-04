package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A014963 Exponential of Mangoldt function M(n): a(n) = 1 unless n is a prime or prime power, in which case a(n) = that prime.
 * @author Sean A. Irvine
 */
public class A014963 extends Sequence1 implements DirectSequence {

  private Z mN = Z.ZERO;

  @Override
  public Z a(final Z n) {
    if (n.isProbablePrime()) {
      return n;
    }
    final Z t = n.isPower();
    return t == null || !t.isProbablePrime() ? Z.ONE : t;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return a(mN);
  }
}
