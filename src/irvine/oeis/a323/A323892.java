package irvine.oeis.a323;
// Generated by gen_seq4.pl rgs/rgs2 at 2023-10-24 18:46

import irvine.oeis.a002.A002487;
import irvine.oeis.a033.A033879;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A323892 Lexicographically earliest sequence such that a(i) = a(j) =&gt; A002487(i) = A002487(j) and A033879(i) = A033879(j), for all i, j &gt;= 1.
 * @author Georg Fischer
 */
public class A323892 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A323892() {
    super(1, new A002487().skip(1), new A033879());
  }
}
