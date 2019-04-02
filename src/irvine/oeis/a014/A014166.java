package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;

/**
 * A014166 Apply partial sum operator 4 times to Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A014166 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014166() {
    super(new A014162());
  }
}
