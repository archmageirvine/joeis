package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024123 a(n) = 10^n - n^9.
 * @author Sean A. Irvine
 */
public class A024123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024123() {
    super(new long[] {10, -101, 460, -1245, 2220, -2730, 2352, -1410, 570, -145, 20}, new long[] {1, 9, -412, -18683, -252144, -1853125, -9077696, -30353607, -34217728, 612579511, 9000000000L});
  }
}
