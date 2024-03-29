package irvine.oeis.a328;
// Generated by gen_seq4.pl rgs/rgs2 at 2023-10-24 18:46

import irvine.oeis.a020.A020639;
import irvine.oeis.a046.A046523;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A328469 Lexicographically earliest infinite sequence such that a(i) = a(j) =&gt; A020639(i) = A020639(j) and A046523(i) = A046523(j) for all i, j.
 * @author Georg Fischer
 */
public class A328469 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A328469() {
    super(1, new A020639(), new A046523());
  }
}
