package irvine.oeis.a309;
// Generated by gen_seq4.pl wparts/wpartsf1 at 2025-03-11 22:45

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A309468 Sum of the prime parts in the partitions of n into 7 parts.
 * @author Georg Fischer
 */
public class A309468 extends LambdaSequence {

  private static int eval1(final int i) {
    return Z.valueOf(i).isProbablePrime() ? 1 : 0; // A010051
  }

  /** Construct the sequence. */
  public A309468() {
    super(0, n -> Integers.SINGLETON.sum(1, n / 7, o -> Integers.SINGLETON.sum(o, (n - o) / 6, m -> Integers.SINGLETON.sum(m, (n - m - o) / 5, l -> Integers.SINGLETON.sum(l, (n - l - m - o) / 4, k -> Integers.SINGLETON.sum(k, (n - k - l - m - o) / 3, j -> Integers.SINGLETON.sum(j, (n - j - k - l - m - o) / 2, i -> Z.valueOf(i * eval1(i) + j * eval1(j) + k * eval1(k) + l * eval1(l) + m * eval1(m) + o * eval1(o) + (n - i - j - k - l - m - o) * eval1(n - i - j - k - l - m - o)))))))));
  }
}

