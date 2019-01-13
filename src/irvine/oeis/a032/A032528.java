package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032528.
 * @author Sean A. Irvine
 */
public class A032528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032528() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 6, 13});
  }
}
