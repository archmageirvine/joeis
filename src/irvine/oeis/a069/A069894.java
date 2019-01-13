package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069894.
 * @author Sean A. Irvine
 */
public class A069894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069894() {
    super(new long[] {1, -3, 3}, new long[] {2, 10, 26});
  }
}
