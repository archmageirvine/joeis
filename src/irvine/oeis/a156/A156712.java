package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156712 Star numbers (A003154) that are also triangular numbers (A000217).
 * @author Sean A. Irvine
 */
public class A156712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156712() {
    super(1, new long[] {1, -15, 15}, new long[] {1, 7, 91});
  }
}
