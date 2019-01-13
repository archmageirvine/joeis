package irvine.oeis.a151;

import irvine.oeis.LinearRecurrence;

/**
 * A151971.
 * @author Sean A. Irvine
 */
public class A151971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151971() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 7, 15, 21});
  }
}
