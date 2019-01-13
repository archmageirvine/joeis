package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017369.
 * @author Sean A. Irvine
 */
public class A017369 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017369() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {32768, 1889568, 17210368, 79235168, 254803968, 656356768});
  }
}
