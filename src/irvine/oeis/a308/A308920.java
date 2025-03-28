package irvine.oeis.a308;
// Generated by gen_seq4.pl wparts/wpartsf1 at 2025-03-11 22:45

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A308920 Sum of the smallest parts in the partitions of n into 6 primes.
 * @author Georg Fischer
 */
public class A308920 extends LambdaSequence {

  private static int eval1(final int i) {
    return Z.valueOf(i).isProbablePrime() ? 1 : 0; // A010051
  }

  /** Construct the sequence. */
  public A308920() {
    super(0, n -> Integers.SINGLETON.sum(1, n / 6, m -> Integers.SINGLETON.sum(m, (n - m) / 5, l -> Integers.SINGLETON.sum(l, (n - l - m) / 4, k -> Integers.SINGLETON.sum(k, (n - k - l - m) / 3, j -> Integers.SINGLETON.sum(j, (n - j - k - l - m) / 2, i -> Z.valueOf(eval1(m) * eval1(l) * eval1(k) * eval1(j) * eval1(i) * eval1(n - i - k - j - l - m) * m)))))));
  }
}
