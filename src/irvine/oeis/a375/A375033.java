package irvine.oeis.a375;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A375033 The maximum even exponent in the prime factorization of n, or 0 if no such exponent exists.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A375033 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z a(final Z n) {
    return FactorUtils.iterate(n, Z.valueOf(0), (x, p, e) -> (e & 1) == 0 && Z.valueOf(e).compareTo(x) > 0 ? Z.valueOf(e) : x);
  }

  @Override
  public Z a(final long n) {
    return FactorUtils.iterate(n, Z.valueOf(0), (x, p, e) -> (e & 1) == 0 && Z.valueOf(e).compareTo(x) > 0 ? Z.valueOf(e) : x);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
