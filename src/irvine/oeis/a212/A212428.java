package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212428 a(n) = 18*n + A000217(n-1).
 * @author Sean A. Irvine
 */
public class A212428 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212428() {
    super(new long[] {1, -3, 3}, new long[] {0, 18, 37});
  }
}
