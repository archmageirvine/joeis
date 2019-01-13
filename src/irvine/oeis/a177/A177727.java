package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177727.
 * @author Sean A. Irvine
 */
public class A177727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177727() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {1, 3, 30, 180, 1300});
  }
}
