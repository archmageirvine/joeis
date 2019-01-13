package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133274.
 * @author Sean A. Irvine
 */
public class A133274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133274() {
    super(new long[] {1, -483, 483}, new long[] {1, 793, 382537});
  }
}
