package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116781.
 * @author Sean A. Irvine
 */
public class A116781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116781() {
    super(new long[] {-2, 0, 2, 1, 3}, new long[] {1, 2, 6, 21, 73});
  }
}
