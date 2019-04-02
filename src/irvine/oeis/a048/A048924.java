package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048924 9-gonal octagonal numbers.
 * @author Sean A. Irvine
 */
public class A048924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048924() {
    super(new long[] {1, -454275, 454275}, new long[] {1, 631125, 286703855361L});
  }
}
