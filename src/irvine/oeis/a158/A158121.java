package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158121.
 * @author Sean A. Irvine
 */
public class A158121 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158121() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {6, 93, 591, 2381, 7316, 18761, 42253});
  }
}
