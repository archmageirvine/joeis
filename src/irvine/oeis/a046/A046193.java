package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046193 Indices of heptagonal numbers <code>(A000566)</code> which are also triangular numbers <code>(A000217)</code>.
 * @author Sean A. Irvine
 */
public class A046193 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046193() {
    super(new long[] {1, -1, -322, 322, 1}, new long[] {1, 5, 221, 1513, 71065});
  }
}
