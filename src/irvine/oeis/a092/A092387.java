package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092387.
 * @author Sean A. Irvine
 */
public class A092387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092387() {
    super(new long[] {1, -4, 4}, new long[] {5, 9, 20});
  }
}
