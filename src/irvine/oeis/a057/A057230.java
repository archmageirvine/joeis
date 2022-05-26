package irvine.oeis.a057;

import java.util.Iterator;
import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A057230.
 * @author Sean A. Irvine
 */
public class A057230 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mSums = getPrimorialSums(1);
  private TreeSet<Z> mA = new TreeSet<>();
  private int mN = 1;

  private Z product(final long set) {
    Z prod = Z.TWO;
    long s = set;
    for (long p = 3; s != 0; s >>>= 1, p = mPrime.nextPrime(p)) {
      if ((s & 1) == 1) {
        prod = prod.multiply(p);
      }
    }
    return prod;
  }

  private TreeSet<Z> getPrimorialSums(final int n) {
    assert n >= 1;
    // Compute all possible sums p + q such that p*q = n#
    final TreeSet<Z> res = new TreeSet<>();
    // Use a bit set to select divison of n# into p and q
    // WLOG, assume 2 | p, so bit set has cardinality n-1
    final long limit = 1L << (n - 1);
    final Z primorial = product(limit - 1);
    for (long set = 0; set < limit; ++set) {
      // Determine p
      final Z p = product(set);
      final Z q = primorial.divide(p);
      res.add(p.add(q));
    }
    return res;
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      final TreeSet<Z> next = getPrimorialSums(++mN);
      if (mVerbose) {
        StringUtils.message("Computed " + next.size() + " sums for " + mN + " least " + next.first());
      }
      mA = new TreeSet<>(next);
      mA.retainAll(mSums);
      // Remove small elements that will never match
      final Z least = next.first();
      for (final Iterator<Z> it = mSums.iterator(); it.hasNext(); ) {
        final Z t = it.next();
        if (t.compareTo(least) >= 0) {
          break;
        }
        it.remove();
      }
      mSums.addAll(next);
    }
    return mA.pollFirst();
  }
}
