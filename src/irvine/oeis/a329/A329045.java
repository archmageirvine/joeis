package irvine.oeis.a329;
// Generated by gen_seq4.pl 2025-01-01.ack/rgs1 at 2025-01-01 23:25

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a046.A046523;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A329045 Lexicographically earliest infinite sequence such that a(i) = a(j) =&gt; A046523(A329044(i)) = A046523(A329044(j)) for all i, j.
 * @author Georg Fischer
 */
public class A329045 extends RestrictedGrowthTransformSequence {

  private static final DirectSequence A046523 = new A046523();
  private static final DirectSequence A329044 = new A329044();

  /** Construct the sequence. */
  public A329045() {
    super(1, new LambdaSequence(1, n -> A046523.a(A329044.a(n))));
  }
}
