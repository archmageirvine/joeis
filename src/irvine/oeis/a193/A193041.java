package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193041.
 * @author Sean A. Irvine
 */
public class A193041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193041() {
    super(new long[] {1, -3, 1, 6, -9, 5}, new long[] {0, 1, 3, 13, 44, 122});
  }
}
