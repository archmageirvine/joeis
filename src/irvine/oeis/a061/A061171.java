package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061171 One half of second column of Lucas bisection triangle (odd part).
 * @author Sean A. Irvine
 */
public class A061171 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061171() {
    super(new long[] {-1, 6, -11, 6}, new long[] {3, 19, 79, 283});
  }
}
