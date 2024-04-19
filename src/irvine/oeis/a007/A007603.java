package irvine.oeis.a007;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007603 Power-sum numbers: let n = a_1 a_2 ... a_k be a k-digit number; n is a power-sum number if there are exponents e_1 ... e_m such that n = Sum_{i=1..m} Sum_{j=1..k} a_j^e_i.
 * @author Sean A. Irvine
 */
public class A007603 extends Sequence1 {

  private final ArrayList<long[]> mPowers = new ArrayList<>();
  {
    final long[] ones = new long[10];
    Arrays.fill(ones, 1);
    mPowers.add(ones);
  }
  private long mN = 0;

  private long pow(final int b, final int e) {
    while (e >= mPowers.size()) {
      final long[] prev = mPowers.get(mPowers.size() - 1);
      final long[] next = new long[10];
      for (int k = 0; k < next.length; ++k) {
        next[k] = k * prev[k];
      }
      mPowers.add(next);
    }
    return mPowers.get(e)[b];
  }

  private boolean isPowerSum(final long n, final long m0, final int minE) {
    int e = minE;
    while (true) {
      long m = m0;
      long s = 0;
      boolean nontriv = false;
      while (m != 0) {
        final int digit = (int) (m % 10);
        s += pow(digit, e);
        m /= 10;
        nontriv |= digit > 1;
      }
      if (s == n) {
        return true;
      }
      if (s > n) {
        return false;
      }
      if (isPowerSum(n - s, m0, e)) {
        return true;
      }
      if (!nontriv) {
        return false;
      }
      ++e;
    }
  }

  @Override
  public Z next() {
    while (true) {
      if (isPowerSum(++mN, mN, 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
