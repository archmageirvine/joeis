package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020956 Sum of <code>[tau^(n-k)]</code> for k from 1 to infinity.
 * @author Sean A. Irvine
 */
public class A020956 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020956() {
    super(new long[] {1, 0, -3, 1, 2}, new long[] {1, 2, 4, 8, 14});
  }
}
