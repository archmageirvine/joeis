package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059255.
 * @author Sean A. Irvine
 */
public class A059255 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059255() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 25, 365, 2030, 7230, 19855});
  }
}
