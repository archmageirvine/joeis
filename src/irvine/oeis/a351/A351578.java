package irvine.oeis.a351;
// Generated by gen_seq4.pl 2025-01-01.ack/rgs2 at 2025-01-01 23:25

import irvine.oeis.DirectSequence;
import irvine.oeis.a005.A005940;
import irvine.oeis.a007.A007814;
import irvine.oeis.a046.A046523;
import irvine.oeis.a109.A109812;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A351578 Lexicographically earliest infinite sequence such that a(i) = a(j) =&gt; A007814(f(i)) = A007814(f(j)) and A278222(f(i)) = A278222(f(j)), for all i, j &gt;= 1, where f(k) = A109812(k).
 * @author Georg Fischer
 */
public class A351578 extends RestrictedGrowthTransformSequence {

  private static final DirectSequence A007814 = new A007814();
  private static final DirectSequence A005940 = new A005940();
  private static final DirectSequence A046523 = new A046523();

  /** Construct the sequence. */
  public A351578() {
    super(1, new SingleTransformSequence(1, (term, n) -> A007814.a(term), "", new A109812()), new SingleTransformSequence(1, (term, n) -> A046523.a(A005940.a(term.add(1))), "", new A109812()));
  }
}
