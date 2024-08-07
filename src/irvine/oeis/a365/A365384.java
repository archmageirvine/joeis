package irvine.oeis.a365;
// Generated by gen_seq4.pl 2024-08-01.ack/rgs1 at 2024-08-01 22:21

import irvine.oeis.a351.A351251;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A365384 Lexicographically earliest infinite sequence such that a(i) = a(j) =&gt; A351251(i) = A351251(j) for all i, j &gt;= 0, where A351251(n) is the denominator of n / A276086(n).
 * @author Georg Fischer
 */
public class A365384 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A365384() {
    super(0, new A351251());
  }
}
