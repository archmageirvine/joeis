package irvine.oeis.a286;
// manually 2022-12-26

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;

/**
 * A286272 Partial sums of A286271.
 * @author Georg Fischer
 */
public class A286272 extends PartialSumSequence {

  /** Construct the sequence. */
  public A286272() {
    super(1, new PrependSequence(new A286271().skip(1), 0));
  }
}
