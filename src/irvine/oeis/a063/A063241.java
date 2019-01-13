package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063241.
 * @author Sean A. Irvine
 */
public class A063241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063241() {
    super(new long[] {-1, 1, 0, 1}, new long[] {3, 5, 7, 13});
  }
}
