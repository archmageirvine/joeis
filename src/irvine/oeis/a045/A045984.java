package irvine.oeis.a045;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045984 a(n) = smallest number m such that factorizations of n consecutive integers starting at m have same number of primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A045984 extends Sequence1 {

  private long mN = 0;
  private long mK = 1;

  private boolean isOk(final long k) {
    final long omega = Functions.BIG_OMEGA.l(k);
    for (int j = 1; j < mN; ++j) {
      if (Functions.BIG_OMEGA.l(k + j) != omega) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!isOk(mK)) {
      ++mK;
    }
    return Z.valueOf(mK);
  }
}
