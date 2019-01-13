package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083335.
 * @author Sean A. Irvine
 */
public class A083335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083335() {
    super(new long[] {-25, 0, 12, 0}, new long[] {1, 1, 7, 12});
  }
}
