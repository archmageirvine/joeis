package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158398 784n^2 - 2n.
 * @author Sean A. Irvine
 */
public class A158398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158398() {
    super(new long[] {1, -3, 3}, new long[] {782, 3132, 7050});
  }
}
