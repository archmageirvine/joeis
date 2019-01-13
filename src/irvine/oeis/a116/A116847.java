package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116847.
 * @author Sean A. Irvine
 */
public class A116847 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116847() {
    super(new long[] {-1, 7, -19, 26, -19, 7}, new long[] {1, 2, 5, 14, 41, 119});
  }
}
