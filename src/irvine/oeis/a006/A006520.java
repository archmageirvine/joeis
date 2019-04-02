package irvine.oeis.a006;

import irvine.oeis.PartialSumSequence;

/**
 * A006520 Partial sums of A006519.
 * @author Sean A. Irvine
 */
public class A006520 extends PartialSumSequence {

  /** Construct the sequence. */
  public A006520() {
    super(new A006519());
  }
}
