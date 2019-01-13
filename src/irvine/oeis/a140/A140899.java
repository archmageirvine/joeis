package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140899.
 * @author Sean A. Irvine
 */
public class A140899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140899() {
    super(new long[] {1, -2, 2, -2, 2}, new long[] {7, 9, 5, 1, 3});
  }
}
