package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A082056 Least x = a(n) such that sum of common prime divisors (without multiplicity) of sigma(x) and phi(x) equals n, or 0 if such number (apparently) does not exist.
 * @author Sean A. Irvine
 */
public class A082056 extends Sequence1 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 2;

  @Override
  public Z next() {
    if (++mN == 1 || mN == 4 || mN == 6) {
      return Z.ZERO;
    }
    while (mFirsts.get(mN) == 0) {
      final long v = Functions.SOPF.l(Functions.GCD.l(Functions.PHI.l(++mM), Functions.SIGMA1.z(mM)));
      if (mFirsts.get(v) == 0) {
        mFirsts.set(v, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
