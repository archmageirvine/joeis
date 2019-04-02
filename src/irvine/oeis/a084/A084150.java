package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084150 A Pell related sequence.
 * @author Sean A. Irvine
 */
public class A084150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084150() {
    super(new long[] {-7, 5, 3}, new long[] {0, 0, 1});
  }
}
