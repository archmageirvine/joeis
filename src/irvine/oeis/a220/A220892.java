package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220892.
 * @author Sean A. Irvine
 */
public class A220892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220892() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 14, 91, 364, 1085, 2666});
  }
}
