package irvine.oeis.a096;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A096230 Period 5: repeat [9, 7, 5, 3, 1].
 * @author Sean A. Irvine
 */
public class A096230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096230() {
    super(1, new long[] {1, 0, 0, 0, 0}, new long[] {9, 7, 5, 3, 1});
  }
}
