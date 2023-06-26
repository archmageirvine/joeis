package irvine.oeis.a036;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A036328 Composite numbers n such that juxtaposition of prime factors of n has length 4.
 * @author Sean A. Irvine
 */
public class A036328 extends FiniteSequence {

  private static void build(final Prime prime, final TreeSet<Z> seq, final int limit, final long p, final long product, final int length) {
    if (length == limit) {
      if (!prime.isPrime(product)) {
        seq.add(Z.valueOf(product));
      }
      return;
    }
    int lq;
    for (long q = p; (lq = length + String.valueOf(q).length()) <= limit; q = prime.nextPrime(q)) {
      build(prime, seq, limit, q, product * q, lq);
    }
  }

  static TreeSet<Z> build(final int length) {
    final Fast prime = new Fast();
    final TreeSet<Z> set = new TreeSet<>();
    build(prime, set, length, 2, 1, 0);
    return set;
  }

  /** Construct the sequence. */
  public A036328() {
    super(1, FINITE, build(4));
  }
}
