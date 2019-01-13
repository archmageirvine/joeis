package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007800.
 * @author Sean A. Irvine
 */
public class A007800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007800() {
    super(new long[] {1, -1, 0, -2, 3}, new long[] {1, 2, 4, 8, 16});
  }
}

