package irvine.oeis.a336;
// Generated by gen_seq4.pl rgs/rgs2 at 2024-01-19 09:42

import irvine.oeis.a278.A278222;
import irvine.oeis.a329.A329697;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A336473 Lexicographically earliest infinite sequence such that a(i) = a(j) =&gt; A278222(i) = A278222(j) and A329697(i) = A329697(j), for all i, j &gt;= 1.
 * @author Georg Fischer
 */
public class A336473 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A336473() {
    super(1, new A278222().skip(1), new A329697());
  }
}
