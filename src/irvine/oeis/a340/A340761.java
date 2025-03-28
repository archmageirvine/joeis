package irvine.oeis.a340;
// Generated by gen_seq4.pl wparts/wpartsum at 2025-03-11 22:45

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A340761 Number of partitions of n into 4 parts whose 'middle' two parts have the same parity.
 * @author Georg Fischer
 */
public class A340761 extends LambdaSequence {

  /** Construct the sequence. */
  public A340761() {
    super(0, n -> Integers.SINGLETON.sum(1, n / 4, k -> Integers.SINGLETON.sum(k, (n - k) / 3, j -> Integers.SINGLETON.sum(j, (n - j - k) / 2, i -> Z.valueOf((j & 1) == (i & 1) ? 1 : 0)))));
  }
}


