package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A000587 Rao Uppuluri-Carpenter numbers (or complementary Bell numbers): e.g.f. = exp(1 - exp(x)).
 * @author Sean A. Irvine
 */
public class A000587 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      s = s.signedAdd((k & 1) == 0, Functions.STIRLING2.z(mN, k));
    }
    return s;
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    return Integers.SINGLETON.sum(0, n, k -> ((k & 1) == 0) ? Functions.STIRLING2.z(n, k) : Functions.STIRLING2.z(n, k).negate());
  }

}
