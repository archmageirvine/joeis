package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033538.
 * @author Sean A. Irvine
 */
public class A033538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033538() {
    super(new long[] {-1, -2, 4}, new long[] {1, 1, 5});
  }
}
