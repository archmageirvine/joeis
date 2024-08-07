package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-08-01.ack/rgs2 at 2024-08-01 22:21

import irvine.oeis.a085.A085731;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A373152 Lexicographically earliest infinite sequence such that a(i) = a(j) =&gt; A085731(i) = A085731(j) and A373145(i) = A373145(j), for all i, j &gt;= 1.
 * @author Georg Fischer
 */
public class A373152 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A373152() {
    super(1, new A085731(), new A373145());
  }
}
