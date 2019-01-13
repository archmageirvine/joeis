package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160827.
 * @author Sean A. Irvine
 */
public class A160827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160827() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {17, 98, 353, 962, 2177});
  }
}
