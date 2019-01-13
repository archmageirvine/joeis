package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174120.
 * @author Sean A. Irvine
 */
public class A174120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174120() {
    super(new long[] {2, -9, 16, -14, 6}, new long[] {1, 2, 2, 1, 1});
  }
}
