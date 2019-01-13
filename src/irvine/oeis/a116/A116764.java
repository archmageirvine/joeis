package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116764.
 * @author Sean A. Irvine
 */
public class A116764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116764() {
    super(new long[] {-9, 19, -17, 7}, new long[] {1, 2, 6, 21});
  }
}
