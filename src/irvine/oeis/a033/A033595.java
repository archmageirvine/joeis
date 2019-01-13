package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033595.
 * @author Sean A. Irvine
 */
public class A033595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033595() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 0, 21, 136, 465});
  }
}
