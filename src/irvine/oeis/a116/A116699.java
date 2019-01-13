package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116699.
 * @author Sean A. Irvine
 */
public class A116699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116699() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 2, 5, 13, 30});
  }
}
