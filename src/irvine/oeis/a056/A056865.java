package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056865.
 * @author Sean A. Irvine
 */
public class A056865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056865() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 0, 0, 1, 2, 3, 4, 6, 8, 10, 12});
  }
}
