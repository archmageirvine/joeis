package irvine.oeis.a322;
// Generated by gen_seq4.pl 2024-08-01.ack/rgs1 at 2024-08-01 22:21

import irvine.oeis.a185.A185633;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A322315 Lexicographically earliest such sequence a that a(i) = a(j) =&gt; A185633(i) = A185633(j) for all i, j.
 * @author Georg Fischer
 */
public class A322315 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A322315() {
    super(1, new A185633());
  }
}
