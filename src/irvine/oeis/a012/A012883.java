package irvine.oeis.a012;

import java.util.Arrays;

import irvine.factor.prime.Fast;
import irvine.oeis.FiniteSequence;

/**
 * A012883 Numbers in which every prefix (in base 10) is 1 or a prime.
 * @author Sean A. Irvine
 */
public class A012883 extends FiniteSequence {

  private static final Fast PRIME = new Fast();

  private static int build(final long[] terms, final long n, int pos) {
    terms[pos++] = n;
    for (int k = 1; k < 10; k += 2) {
      final long c = 10 * n + k;
      if (PRIME.isPrime(c)) {
        pos = build(terms, c, pos);
      }
    }
    return pos;
  }

  private static long[] build() {
    final long[] terms = new long[147]; // known finite length
    if (build(terms, 7, build(terms, 5, build(terms, 3, build(terms, 2, build(terms, 1, 0))))) != terms.length) {
      throw new RuntimeException();
    }
    Arrays.sort(terms);
    return terms;
  }

  /** Construct the sequence. */
  public A012883() {
    super(1, FINITE, build());
  }

}
