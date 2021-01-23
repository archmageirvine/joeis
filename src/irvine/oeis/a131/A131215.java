package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131215 Numbers which are both 11-gonal and centered 11-gonal.
 * @author Sean A. Irvine
 */
public class A131215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131215() {
    super(new long[] {1, -399, 399}, new long[] {1, 606, 241396});
  }
}
