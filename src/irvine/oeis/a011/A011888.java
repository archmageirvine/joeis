package irvine.oeis.a011;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;

/**
 * A011888 Partial sums of A011863.
 * @author Sean A. Irvine
 */
public class A011888 extends PartialSumSequence {

  /** Construct the sequence. */
  public A011888() {
    super(new SkipSequence(new A011863(), 1));
  }
}
