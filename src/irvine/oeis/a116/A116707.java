package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116707.
 * @author Sean A. Irvine
 */
public class A116707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116707() {
    super(new long[] {-4, 16, -16, 7}, new long[] {1, 2, 6, 22});
  }
}
