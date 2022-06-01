package irvine.oeis.a192;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A192932 Squares of numbers in Perrin sequence.
 * @author Sean A. Irvine
 */
public class A192932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192932() {
    super(new long[] {-1, 1, -1, 1, 1, 1}, new long[] {9, 0, 4, 9, 4, 25});
  }
}
