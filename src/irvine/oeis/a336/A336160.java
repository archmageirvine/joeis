package irvine.oeis.a336;
// Generated by gen_seq4.pl rgs/rgs2 at 2023-10-24 18:46

import irvine.oeis.a335.A335915;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A336160 Lexicographically earliest infinite sequence such that a(i) = a(j) =&gt; A335915(i) = A335915(j) and A336158(i) = A336158(j), for all i, j &gt;= 1.
 * @author Georg Fischer
 */
public class A336160 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A336160() {
    super(1, new A335915(), new A336158());
  }
}
