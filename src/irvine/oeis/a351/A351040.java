package irvine.oeis.a351;
// Generated by gen_seq4.pl rgs/rgs3 at 2023-10-24 18:46

import irvine.oeis.a000.A000593;
import irvine.oeis.a336.A336158;
import irvine.oeis.a336.A336467;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A351040 Lexicographically earliest infinite sequence such that a(i) = a(j) =&gt; A336158(i) = A336158(j), A206787(i) = A206787(j) and A336651(i) = A336651(j) for all i, j &gt;= 1.
 * @author Georg Fischer
 */
public class A351040 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A351040() {
    super(1, new A000593(), new A336158(), new A336467());
  }
}
