package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A079637 Smallest prime p with audioactive "echo" of at least <code>n,</code> that is, the finite sequence p_0 = p, p_1 = LookAndSay(p_0),...,p_n = LookAndSay(p_(n-1)) consists entirely of primes.
 * @author Sean A. Irvine
 */
public class A079637 implements Sequence {

  private long mN = -1;
  private long mPrev = 2;
  private final Fast mPrime = new Fast();

  private String lookAndSay(final String n) {
    final StringBuilder sb = new StringBuilder();
    int cnt = 0;
    char p = 0;
    for (int k = 0; k < n.length(); ++k) {
      final char c = n.charAt(k);
      if (c == p) {
        ++cnt;
      } else {
        if (p != 0) {
          sb.append(cnt).append(p);
        }
        p = c;
        cnt = 1;
      }
    }
    sb.append(cnt).append(p);
    return sb.toString();
  }

  private long audioEcho(final long v) {
    Z n = Z.valueOf(v);
    long echo = -1;
    while (mPrime.isPrime(n)) {
      ++echo;
      n = new Z(lookAndSay(n.toString()));
    }
    return echo;
  }


  @Override
  public Z next() {
    ++mN;
    while (audioEcho(mPrev) < mN) {
      mPrev = mPrime.nextPrime(mPrev);
    }
    return Z.valueOf(mPrev);
  }
}

