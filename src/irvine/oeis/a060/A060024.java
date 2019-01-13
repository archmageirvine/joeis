package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060024.
 * @author Sean A. Irvine
 */
public class A060024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060024() {
    super(new long[] {1, -1, -1, 0, 0, 1, 1, 1, -1, -1, -1, 0, 0, 1, 1}, new long[] {1, 0, 1, 1, 2, 1, 2, 1, 2, 0, 0, -3, -3, -8, -10});
  }
}
