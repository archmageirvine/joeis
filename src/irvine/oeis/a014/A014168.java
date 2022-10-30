package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;

/**
 * A014168 Apply partial sum operator twice to binary rooted tree numbers.
 * @author Sean A. Irvine
 */
public class A014168 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014168() {
    super(1, new A014167());
  }
}
