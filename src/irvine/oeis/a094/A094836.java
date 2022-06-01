package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094836 a(n) = 2702*a(n-1) - a(n-2); a(-1) = -15; a(0) = 15.
 * @author Sean A. Irvine
 */
public class A094836 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094836() {
    super(new long[] {-1, 2702}, new long[] {-15, 15});
  }
}
