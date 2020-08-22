package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111955 a(n) = A078343(n) + (-1)^n.
 * @author Sean A. Irvine
 */
public class A111955 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111955() {
    super(new long[] {1, 3, 1}, new long[] {0, 1, 4});
  }
}
