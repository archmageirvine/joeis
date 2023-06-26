package irvine.oeis.a048;

import java.util.TreeSet;

import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002476;

/**
 * A048265 Positive integers that aren't the sum of distinct primes of the form 6k+1.
 * @author Sean A. Irvine
 */
public class A048265 extends FiniteSequence {

  private static final long LARGEST_TERM = 205;

  private static long[] build() {
    final TreeSet<Long> a = new TreeSet<>();
    a.add(0L);
    final Sequence seq = new A002476();
    long p;
    while ((p = seq.next().longValueExact()) <= LARGEST_TERM) {
      final TreeSet<Long> b = new TreeSet<>();
      for (final long c : a) {
        if (c + p <= LARGEST_TERM) {
          b.add(c + p);
        }
      }
      a.addAll(b);
    }
    final long[] res = new long[79]; // known number of terms
    int j = 0;
    for (long k = 1; k <= LARGEST_TERM; ++k) {
      if (!a.contains(k)) {
        res[j++] = k;
      }
    }
    return res;
  }

  /** Construct the sequence. */
  public A048265() {
    super(1, FINITE, build());
  }
}
