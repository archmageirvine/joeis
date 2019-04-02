package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024004 a(n) = 1 - n^6.
 * @author Sean A. Irvine
 */
public class A024004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024004() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 0, -63, -728, -4095, -15624, -46655});
  }
}
