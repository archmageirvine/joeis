package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063492.
 * @author Sean A. Irvine
 */
public class A063492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063492() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 14, 60, 161});
  }
}
