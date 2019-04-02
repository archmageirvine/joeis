package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;

/**
 * A014173 Apply partial sum operator thrice to Stern's sequence.
 * @author Sean A. Irvine
 */
public class A014173 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014173() {
    super(new A014172());
  }
}
