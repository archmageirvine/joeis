package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254895.
 * @author Sean A. Irvine
 */
public class A254895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254895() {
    super(new long[] {1, -1, -98, 98, 1}, new long[] {1, 13, 53, 1241, 5161});
  }
}
