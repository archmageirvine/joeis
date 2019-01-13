package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116845.
 * @author Sean A. Irvine
 */
public class A116845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116845() {
    super(new long[] {1, -7, 17, -17, 7}, new long[] {1, 2, 5, 14, 41});
  }
}
