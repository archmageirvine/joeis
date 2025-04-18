package irvine.oeis.a259;
// Generated by gen_seq4.pl wparts/wpartsf1 at 2025-03-11 22:45

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A259200 Number of partitions of n into nine primes.
 * @author Georg Fischer
 */
public class A259200 extends LambdaSequence {

  private static int eval1(final int i) {
    return Z.valueOf(i).isProbablePrime() ? 1 : 0; // A010051
  }

  /** Construct the sequence. */
  public A259200() {
    super(18, n -> Integers.SINGLETON.sum(1, n / 9, q -> Integers.SINGLETON.sum(q, (n - q) / 8, p -> Integers.SINGLETON.sum(p, (n - p - q) / 7, o -> Integers.SINGLETON.sum(o, (n - o - p - q) / 6, m -> Integers.SINGLETON.sum(m, (n - m - o - p - q) / 5, l -> Integers.SINGLETON.sum(l, (n - l - m - o - p - q) / 4, k -> Integers.SINGLETON.sum(k, (n - k - l - m - o - p - q) / 3, j -> Integers.SINGLETON.sum(j, (n - j - k - l - m - o - p - q) / 2, i -> Z.valueOf(eval1(q) * eval1(p) * eval1(o) * eval1(m) * eval1(l) * eval1(k) * eval1(j) * eval1(i) * eval1(n - i - j - k - l - m - o - p - q)))))))))));
  }
}
