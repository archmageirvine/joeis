package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097162.
 * @author Sean A. Irvine
 */
public class A097162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097162() {
    super(new long[] {20, -20, -9, 9, 1}, new long[] {1, 3, 7, 21, 37});
  }
}
