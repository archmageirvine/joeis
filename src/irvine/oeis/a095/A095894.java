package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095894.
 * @author Sean A. Irvine
 */
public class A095894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095894() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 7, 14, 26});
  }
}
