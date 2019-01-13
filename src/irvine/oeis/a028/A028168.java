package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028168.
 * @author Sean A. Irvine
 */
public class A028168 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028168() {
    super(new long[] {-2310, 1387, -305, 29}, new long[] {1, 29, 536, 8086});
  }
}
