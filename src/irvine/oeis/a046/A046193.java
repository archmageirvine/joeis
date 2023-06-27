package irvine.oeis.a046;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A046193 Indices of heptagonal numbers (A000566) which are also triangular numbers (A000217).
 * @author Sean A. Irvine
 */
public class A046193 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046193() {
    super(1, new long[] {1, -1, -322, 322, 1}, new long[] {1, 5, 221, 1513, 71065});
  }
}
