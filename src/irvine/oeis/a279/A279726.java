package irvine.oeis.a279;
// Generated by gen_seq4.pl robots/partsum at 2023-09-04 09:14

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a187.A187619;

/**
 * A279726 Partial sums of A187619.
 * @author Georg Fischer
 */
public class A279726 extends PrependSequence {

  /** Construct the sequence. */
  public A279726() {
    super(1, new PartialSumSequence(new A187619()), 0);
  }
}
