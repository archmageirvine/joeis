package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116837.
 * @author Sean A. Irvine
 */
public class A116837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116837() {
    super(new long[] {-2, 6, -7, 5}, new long[] {1, 2, 6, 21});
  }
}
