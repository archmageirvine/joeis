package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160250.
 * @author Sean A. Irvine
 */
public class A160250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160250() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 93, 617, 1957});
  }
}
