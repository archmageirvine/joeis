package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255848.
 * @author Sean A. Irvine
 */
public class A255848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255848() {
    super(new long[] {1, -3, 3}, new long[] {18, 20, 26});
  }
}
