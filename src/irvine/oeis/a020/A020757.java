package irvine.oeis.a020;

import irvine.oeis.ComplementSequence;

/**
 * A020757 Numbers that are not the sum of two triangular numbers.
 * @author Sean A. Irvine
 */
public class A020757 extends ComplementSequence {

  /** Construct the sequence. */
  public A020757() {
    super(new A020756());
  }
}
