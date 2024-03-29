package irvine.oeis.a366;
// Generated by gen_seq4.pl rgs/rgs2 at 2023-12-08 20:56

import irvine.oeis.a336.A336158;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A366790 Lexicographically earliest infinite sequence such that a(i) = a(j) =&gt; A366789(i) = A366789(j) and A336158(i) = A336158(j), for all i, j &gt;= 1.
 * @author Georg Fischer
 */
public class A366790 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A366790() {
    super(1, new A366789(), new A336158());
  }
}
