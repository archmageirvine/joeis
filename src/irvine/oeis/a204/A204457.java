package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204457.
 * @author Sean A. Irvine
 */
public class A204457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204457() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 3, 5, 7, 9, 11, 15, 17, 19, 21, 23, 25, 27});
  }
}
