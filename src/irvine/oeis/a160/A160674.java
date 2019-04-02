package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160674 A bisection of A063522.
 * @author Sean A. Irvine
 */
public class A160674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160674() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 63, 305, 847});
  }
}
