package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080335.
 * @author Sean A. Irvine
 */
public class A080335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080335() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 5, 9, 17});
  }
}
