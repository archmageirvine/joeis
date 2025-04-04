package irvine.oeis.a348;
// Generated by gen_seq4.pl wparts/wpartsf2 at 2025-03-11 22:45

import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A348536 Number of partitions of n into 3 parts that divide n.
 * @author Georg Fischer
 */
public class A348536 extends LambdaSequence {

  private static int eval2(final int i, final int j) {
    final Q qv = new Q(i, j);
    return 1 - qv.ceiling().intValue() + qv.floor().intValue(); // f1chi
  }

  /** Construct the sequence. */
  public A348536() {
    super(1, n -> Integers.SINGLETON.sum(1, n / 3, j -> Integers.SINGLETON.sum(j, (n - j) / 2, i -> Z.valueOf(eval2(n, j) * eval2(n, i) * eval2(n, n - i - j)))));
  }
}

