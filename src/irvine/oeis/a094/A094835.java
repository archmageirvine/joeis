package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094835 a(n) = 2702*a(n-1) - a(n-2); a(-1) = a(0) = 26.
 * @author Sean A. Irvine
 */
public class A094835 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094835() {
    super(-1, new long[] {-1, 2702}, new long[] {26, 26});
  }
}
