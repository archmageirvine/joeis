package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146311.
 * @author Sean A. Irvine
 */
public class A146311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146311() {
    super(new long[] {-1, -10}, new long[] {1, -5});
  }
}
