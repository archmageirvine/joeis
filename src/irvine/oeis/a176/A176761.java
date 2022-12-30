package irvine.oeis.a176;
// manually 2022-12-26

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a030.A030001;

/**
 * A176761 Partial sums of A030001, starting at n=1.
 * @author Georg Fischer
 */
public class A176761 extends PartialSumSequence {

  /** Construct the sequence. */
  public A176761() {
    super(1, new SkipSequence(new A030001(), 1));
  }
}
