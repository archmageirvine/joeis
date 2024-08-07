package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-08-01.ack/rgs1 at 2024-08-01 22:21

import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A373988 Lexicographically earliest infinite sequence such that a(i) = a(j) =&gt; A373986(i) = A373986(j), for all i, j &gt;= 1.
 * @author Georg Fischer
 */
public class A373988 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A373988() {
    super(1, new A373986());
  }
}
