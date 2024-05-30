package irvine.oeis.a175;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A175303 a(n) = number of finite sequences using numbers drawn from (1,2,3,...,n), using each number at most once, where each number in a finite sequence is not coprime to the previous number, and each finite sequence must continued if possible. (See example.).
 * @author Sean A. Irvine
 */
public class A175303 extends Sequence1 {

  private int mN = 0;
  private long mPrev = 0;
  private final Fast mPrime = new Fast();

  private long count(final int prev, final boolean[] used) {
    long c = 0;
    boolean extended = false;
    for (int k = 1; k < used.length; ++k) {
      if (!used[k] && Functions.GCD.i(k, prev) != 1) {
        extended = true;
        used[k] = true;
        c += count(k, used);
        used[k] = false;
      }
    }
    return extended ? c : 1;
  }

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      return Z.valueOf(++mPrev);
    }
    final boolean[] used = new boolean[mN + 1];
    long c = 0;
    for (int k = 1; k <= mN; ++k) {
      used[k] = true;
      c += count(k, used);
      used[k] = false;
    }
    mPrev = c;
    return Z.valueOf(c);
  }
}

