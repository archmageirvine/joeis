package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086347 On a <code>3 X 3</code> board, number of n-move routes of chess king ending in a given side square.
 * @author Sean A. Irvine
 */
public class A086347 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086347() {
    super(new long[] {4, 4}, new long[] {1, 5});
  }
}
