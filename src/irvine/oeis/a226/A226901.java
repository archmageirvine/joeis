package irvine.oeis.a226;
// manually 2020-11-16

import irvine.oeis.PartialSumSequence;

/**
 * A226901 Partial sums of Hooley's Delta function.
 * @author Georg Fischer
 */
public class A226901 extends PartialSumSequence {

  /** Construct the sequence. */
  public A226901() {
    super(1, new A226898());
  }
}
