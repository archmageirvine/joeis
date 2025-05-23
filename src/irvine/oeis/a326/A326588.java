package irvine.oeis.a326;
// Generated by gen_seq4.pl wparts/wpartsum at 2025-03-11 22:45

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A326588 Sum of all the parts in the partitions of n into 10 parts.
 * @author Georg Fischer
 */
public class A326588 extends LambdaSequence {

  /** Construct the sequence. */
  public A326588() {
    super(0, n -> Integers.SINGLETON.sum(1, n / 10, r -> Integers.SINGLETON.sum(r, (n - r) / 9, q -> Integers.SINGLETON.sum(q, (n - q - r) / 8, p -> Integers.SINGLETON.sum(p, (n - p - q - r) / 7, o -> Integers.SINGLETON.sum(o, (n - o - p - q - r) / 6, m -> Integers.SINGLETON.sum(m, (n - m - o - p - q - r) / 5, l -> Integers.SINGLETON.sum(l, (n - l - m - o - p - q - r) / 4, k -> Integers.SINGLETON.sum(k, (n - k - l - m - o - p - q - r) / 3, j -> Integers.SINGLETON.sum(j, (n - j - k - l - m - o - p - q - r) / 2, i -> Z.ONE))))))))).multiply(n));
  }
}
