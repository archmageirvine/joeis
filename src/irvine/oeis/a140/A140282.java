package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140282 Numbers k such that A000330(k) is multiple of 3.
 * @author Sean A. Irvine
 */
public class A140282 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140282() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 4, 8, 9});
  }
}
