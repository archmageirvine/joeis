package irvine.oeis.a039;

import irvine.oeis.PartialSumSequence;

/**
 * A039677 Partial sums of Fibonacci-lucky numbers.
 * @author Sean A. Irvine
 */
public class A039677 extends PartialSumSequence {

  /** Construct the sequence. */
  public A039677() {
    super(new A039672());
  }
}
