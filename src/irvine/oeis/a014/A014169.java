package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;

/**
 * A014169 Apply partial sum operator thrice to binary rooted tree numbers.
 * @author Sean A. Irvine
 */
public class A014169 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014169() {
    super(1, new A014168());
  }
}
