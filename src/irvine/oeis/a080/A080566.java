package irvine.oeis.a080;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a079.A079000;

/**
 * A080566 Partial sums of A079000.
 * @author Sean A. Irvine
 */
public class A080566 extends PartialSumSequence {

  /** Construct the sequence. */
  public A080566() {
    super(1, new A079000());
  }
}
