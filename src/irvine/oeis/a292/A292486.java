package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292486.
 * @author Sean A. Irvine
 */
public class A292486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292486() {
    super(new long[] {3, 9, -4, 5}, new long[] {1, 7, 36, 165});
  }
}
