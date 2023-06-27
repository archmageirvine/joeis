package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048924 9-gonal octagonal numbers.
 * @author Sean A. Irvine
 */
public class A048924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048924() {
    super(1, new long[] {1, -454275, 454275}, new long[] {1, 631125, 286703855361L});
  }
}
