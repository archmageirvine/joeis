package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251730.
 * @author Sean A. Irvine
 */
public class A251730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251730() {
    super(new long[] {1, -15, 15}, new long[] {10, 152, 2130});
  }
}
