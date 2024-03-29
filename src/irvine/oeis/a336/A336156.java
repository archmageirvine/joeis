package irvine.oeis.a336;
// Generated by gen_seq4.pl rgsman/rgs2 at 2023-10-27 23:32

import irvine.oeis.a007.A007814;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A336156 Lexicographically earliest infinite sequence such that a(i) = a(j) =&gt; A007814(1+i) = A007814(1+j) and A336158(i) = A336158(j), for all i, j &gt;= 1.
 * @author Georg Fischer
 */
public class A336156 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A336156() {
    super(1, new A007814().skip(1), new A336158());
  }
}
