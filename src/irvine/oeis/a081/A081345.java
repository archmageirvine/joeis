package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081345 First row in maze arrangement of natural numbers A081344.
 * @author Sean A. Irvine
 */
public class A081345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081345() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 4, 5, 16, 17});
  }
}
