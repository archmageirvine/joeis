package irvine.oeis.a078;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A078425 Primes in "Ulam's Prime sequence". A prime is in the sequence iff p+1 can be expressed in exactly 1 way as the sum of 2 previous distinct primes.
 * @author Sean A. Irvine
 */
public class A078425 extends CachedSequence {

  private final HashSet<Z> mForbidden = new HashSet<>();
  private final TreeSet<Z> mQ = new TreeSet<>();

  /** Construct the sequence. */
  public A078425() {
    super(1);
  }

  @Override
  protected Z compute(final Z nn) {
    final int n = nn.intValueExact();
    if (n <= 1) {
      return Z.THREE;
    }
    if (n == 2) {
      mQ.add(Z.SEVEN);
      return Z.FIVE;
    }
    while (true) {
      final Z p = mQ.pollFirst();
      if (!mForbidden.remove(p)) {
        // p is in the sequence
        for (int k = 1; k < n; ++k) {
          final Z t = p.add(a(k)).subtract(1);
          if (t.isProbablePrime() && !mQ.add(t)) {
            mForbidden.add(t);
          }
        }
        return p;
      }
    }
  }
}

