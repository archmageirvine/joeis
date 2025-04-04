package irvine.oeis.a215;
// Generated by gen_seq4.pl 2025-03-16.ack/lambdan at 2025-03-16 17:02

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A215712 Numerator of sum(i=1..n, 3*i/4^i ).
 * @author Georg Fischer
 */
public class A215712 extends LambdaSequence {

  /** Construct the sequence. */
  public A215712() {
    super(1, n -> Rationals.SINGLETON.sum(1, n, i -> new Q(3 * i, Z.FOUR.pow(i))).num());
  }
}
