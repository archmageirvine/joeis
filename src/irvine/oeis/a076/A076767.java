package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076767 Triangular numbers with square pyramidal indices.
 * @author Sean A. Irvine
 */
public class A076767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076767() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 15, 105, 465, 1540, 4186});
  }
}
