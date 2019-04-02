package irvine.oeis.a001;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000045;

/**
 * A001924 Apply partial sum operator twice to Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A001924 extends PartialSumSequence {

  /** Construct the sequence. */
  public A001924() {
    super(new PartialSumSequence(new A000045()));
  }
}
