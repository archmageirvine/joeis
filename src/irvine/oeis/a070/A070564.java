package irvine.oeis.a070;
// manually partsum at 2023-05-03 22:39

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;

/**
 * A070564 Partial sums of A070563.
 * @author Georg Fischer
 */
public class A070564 extends PartialSumSequence {

  /** Construct the sequence. */
  public A070564() {
    super(0, new PrependSequence(0, new A070563(), 0));
  }
}
