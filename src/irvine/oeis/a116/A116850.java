package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116850.
 * @author Sean A. Irvine
 */
public class A116850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116850() {
    super(new long[] {-8, 36, -66, 63, -33, 9}, new long[] {1, 2, 5, 14, 41, 119});
  }
}
