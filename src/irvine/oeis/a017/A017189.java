package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017189.
 * @author Sean A. Irvine
 */
public class A017189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017189() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {32, 161051, 3200000, 20511149, 79235168, 229345007});
  }
}
