package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193007.
 * @author Sean A. Irvine
 */
public class A193007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193007() {
    super(new long[] {1, -3, 1, 6, -9, 5}, new long[] {0, 1, 1, 9, 36, 108});
  }
}
