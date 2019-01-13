package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177342.
 * @author Sean A. Irvine
 */
public class A177342 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177342() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 9, 31, 75});
  }
}
