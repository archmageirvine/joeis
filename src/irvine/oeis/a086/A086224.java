package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086224.
 * @author Sean A. Irvine
 */
public class A086224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086224() {
    super(new long[] {-2, 3}, new long[] {6, 13});
  }
}
