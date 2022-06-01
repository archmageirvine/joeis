package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127365 Signed repeated natural numbers.
 * @author Sean A. Irvine
 */
public class A127365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127365() {
    super(new long[] {-1, 0, -2, 0}, new long[] {0, 0, -1, -1});
  }
}
