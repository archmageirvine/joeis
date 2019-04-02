package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;

/**
 * A014151 Apply partial sum operator thrice to Catalan numbers.
 * @author Sean A. Irvine
 */
public class A014151 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014151() {
    super(new A014140());
  }
}
