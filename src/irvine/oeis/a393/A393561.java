package irvine.oeis.a393;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A393561 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A393561 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private int mN = 1;

  private boolean is(final long p) {
    final Z s0 = Functions.SIGMA0.z(p + 1);
    final Z sn1 = Functions.SIGMA1.z(p + mN + 1);
    if (s0.equals(sn1)) {
      return false;
    }
    for (int k = 2; k <= mN; ++k) {
      if (!Functions.SIGMA0.z(p + k).equals(s0)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    long q = 3;
    while (true) {
      final long p = q;
      q = mPrime.nextPrime(q);
      // Use prime gap as an initial filter
      if (q - p > mN && is(p)) {
        return Z.valueOf(p);
      }
    }
  }
}
