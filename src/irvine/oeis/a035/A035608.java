package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035608.
 * @author Sean A. Irvine
 */
public class A035608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035608() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 5, 10});
  }
}
