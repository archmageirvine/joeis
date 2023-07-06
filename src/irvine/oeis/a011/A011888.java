package irvine.oeis.a011;

import irvine.oeis.PartialSumSequence;

/**
 * A011888 Partial sums of A011863.
 * @author Sean A. Irvine
 */
public class A011888 extends PartialSumSequence {

  /** Construct the sequence. */
  public A011888() {
    super(new A011863().skip(1));
  }
}
