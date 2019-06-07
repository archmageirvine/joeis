package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180667 The maximum number of points obtainable in a game of Entanglement on a board of radius <code>n</code>.
 * @author Sean A. Irvine
 */
public class A180667 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180667() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {41, 1613, 9080, 29462, 72479});
  }
}
