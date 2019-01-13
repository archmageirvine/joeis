package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162267.
 * @author Sean A. Irvine
 */
public class A162267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162267() {
    super(new long[] {-1, 4, -6, 4}, new long[] {6, 23, 57, 114});
  }
}
