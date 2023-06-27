package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133274 Numbers which are both 12-gonal and centered 12-gonal numbers.
 * @author Sean A. Irvine
 */
public class A133274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133274() {
    super(1, new long[] {1, -483, 483}, new long[] {1, 793, 382537});
  }
}
