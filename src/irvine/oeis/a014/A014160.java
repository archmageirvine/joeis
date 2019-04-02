package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;

/**
 * A014160 Apply partial sum operator thrice to partition numbers.
 * @author Sean A. Irvine
 */
public class A014160 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014160() {
    super(new A014153());
  }
}
