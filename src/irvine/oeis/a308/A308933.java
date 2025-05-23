package irvine.oeis.a308;
// Generated by gen_seq4.pl wparts/wpartsum at 2025-03-11 22:45

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A308933 Sum of the largest parts in the partitions of n into 7 parts.
 * @author Georg Fischer
 */
public class A308933 extends LambdaSequence {

  /** Construct the sequence. */
  public A308933() {
    super(0, n -> Integers.SINGLETON.sum(1, n / 7, o -> Integers.SINGLETON.sum(o, (n - o) / 6, m -> Integers.SINGLETON.sum(m, (n - m - o) / 5, l -> Integers.SINGLETON.sum(l, (n - l - m - o) / 4, k -> Integers.SINGLETON.sum(k, (n - k - l - m - o) / 3, j -> Integers.SINGLETON.sum(j, (n - j - k - l - m - o) / 2, i -> Z.valueOf(n - i - j - k - l - m - o))))))));
  }
}


