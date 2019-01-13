package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014010.
 * @author Sean A. Irvine
 */
public class A014010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014010() {
    super(new long[] {-3, 1, -1, 1, 3}, new long[] {2, 6, 19, 61, 196});
  }
}

