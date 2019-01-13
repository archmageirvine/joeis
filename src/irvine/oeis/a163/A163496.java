package irvine.oeis.a163;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.HashSet;

/**
 * A163496.
 * @author Sean A. Irvine
 */
public class A163496 implements Sequence {

  private long mN = 0;
  private final Fast mPrime = new Fast();
  private final HashSet<Z> mCandidates = new HashSet<>();

  private void process(final String n, final int p) {
    if (p >= n.length()) {
      final Z m = new Z(n, 2);
      if (mPrime.isPrime(m)) {
        mCandidates.add(m);
      }
    } else {
      process(n, p + 1); // handle 0's and non-double 1's
      if (n.charAt(p) == '1') {
        process(n.substring(0, p) + '1' + n.substring(p), p + 2);
      }
    }
  }

  private int sumThem(final String n) {
    mCandidates.clear();
    process(n, 0);
    return mCandidates.size();
  }

  @Override
  public Z next() {
    return Z.valueOf(sumThem(Long.toBinaryString(++mN)));
  }
}

