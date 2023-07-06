package irvine.oeis.a058;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a055.A055642;

/**
 * A058183 Number of digits in concatenation of first n positive integers.
 * @author Sean A. Irvine
 */
public class A058183 extends PartialSumSequence {

  /** Construct the sequence. */
  public A058183() {
    super(1, new A055642().skip(1));
  }
}
