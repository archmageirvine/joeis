package irvine.oeis.a250;
// Generated by gen_seq4.pl 2024-03-27/lambdan at 2024-03-27 21:37

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A250550 Numerator of the harmonic mean of the first n 10-gonal numbers.
 * @author Georg Fischer
 */
public class A250550 extends LambdaSequence {

  /** Construct the sequence. */
  public A250550() {
    super(1, n -> new Q(n).divide(Rationals.SINGLETON.sum(1, n, k -> new Q(Z.ONE, Z.valueOf(k * (4L * k - 3))))).num());
  }
}
