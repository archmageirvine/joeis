package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140096.
 * @author Sean A. Irvine
 */
public class A140096 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140096() {
    super(new long[] {-2, -1, 3, -3, -1, 3}, new long[] {0, 1, 1, 1, 1, 1});
  }
}
