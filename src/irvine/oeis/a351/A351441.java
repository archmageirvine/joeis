package irvine.oeis.a351;
// Generated by gen_seq4.pl rgs/rgs2 at 2023-10-24 18:46

import irvine.oeis.a003.A003557;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A351441 Lexicographically earliest infinite sequence such that a(i) = a(j) =&gt; A003557(i) = A003557(j) and A351450(i) = A351450(j) for all i, j &gt;= 1.
 * @author Georg Fischer
 */
public class A351441 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A351441() {
    super(1, new A003557(), new A351450());
  }
}
