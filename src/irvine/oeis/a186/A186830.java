package irvine.oeis.a186;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A186830 Keith sequence for the number 197.
 * @author Sean A. Irvine
 */
public class A186830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186830() {
    super(1, new long[] {1, 1, 1}, new long[] {1, 9, 7});
  }
}
