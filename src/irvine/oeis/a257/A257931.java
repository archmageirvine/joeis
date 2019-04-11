package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257931 Period length 24 sequence <code>[ 0, 1, 1, 0, -2, -1, 0, 1, 0, 0, -1, -1, 0, 1, 1, 0, 0, -1, 0, 1, 2, 0, -1, -1]</code>.
 * @author Sean A. Irvine
 */
public class A257931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257931() {
    super(new long[] {-1, 1, -1, 0, 1, -1, 1, 0, -1, 1}, new long[] {0, 1, 1, 0, -2, -1, 0, 1, 0, 0});
  }
}
