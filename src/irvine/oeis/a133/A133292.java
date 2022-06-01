package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133292 Period 9: repeat [1, 1, 2, 4, 7, 2, 7, 4, 2].
 * @author Sean A. Irvine
 */
public class A133292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133292() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 4, 7, 2, 7, 4, 2});
  }
}
