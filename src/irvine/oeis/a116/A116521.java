package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116521 Binomial transform of tetranacci sequence A000078.
 * @author Sean A. Irvine
 */
public class A116521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116521() {
    super(new long[] {-1, 6, -8, 5}, new long[] {0, 0, 0, 1});
  }
}
