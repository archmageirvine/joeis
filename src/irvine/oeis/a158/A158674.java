package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158674 Period <code>18</code>: repeat <code>3, 4, 0, 8, 6, 3, 3, 7, 0, 2, 6, 6, 3, 1, 0, 5, 6, 0</code>.
 * @author Sean A. Irvine
 */
public class A158674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158674() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {3, 4, 0, 8, 6, 3, 3, 7, 0, 2, 6, 6, 3, 1, 0, 5, 6, 0});
  }
}
