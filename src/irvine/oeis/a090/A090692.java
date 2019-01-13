package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090692.
 * @author Sean A. Irvine
 */
public class A090692 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090692() {
    super(new long[] {-1, 2, 2}, new long[] {30, 42, 146});
  }
}
