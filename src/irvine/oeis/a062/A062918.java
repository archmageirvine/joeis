package irvine.oeis.a062;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a004.A004086;

/**
 * A062918 Sum of the digit reversals of the first n natural numbers.
 * @author Sean A. Irvine
 */
public class A062918 extends PartialSumSequence {

  /** Construct the sequence. */
  public A062918() {
    super(1, new A004086().skip(1));
  }
}

