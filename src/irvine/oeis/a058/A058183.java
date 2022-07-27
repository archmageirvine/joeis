package irvine.oeis.a058;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a055.A055642;

/**
 * A058183 Number of digits in concatenation of first n positive integers.
 * @author Sean A. Irvine
 */
public class A058183 extends PartialSumSequence {

  /** Construct the sequence. */
  public A058183() {
    super(new SkipSequence(new A055642(), 1));
  }
}
