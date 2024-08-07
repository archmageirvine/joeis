package irvine.oeis.a331;
// Generated by gen_seq4.pl 2024-08-01.ack/rgs2 at 2024-08-01 22:21

import irvine.oeis.a263.A263297;
import irvine.oeis.a325.A325225;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A331297 Lexicographically earliest infinite sequence such that a(i) = a(j) =&gt; A263297(i) = A263297(j) and A325225(i) = A325225(j) for all i, j.
 * @author Georg Fischer
 */
public class A331297 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A331297() {
    super(1, new A263297(), new A325225());
  }
}
