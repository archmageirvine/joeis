package irvine.oeis.a108;
// manually 2022-12-26

import irvine.oeis.PartialSumSequence;

/**
 * A108130 Partial sums of A108129.
 * @author Georg Fischer
 */
public class A108130 extends PartialSumSequence {

  /** Construct the sequence. */
  public A108130() {
    super(1, new A108129());
  }
}
