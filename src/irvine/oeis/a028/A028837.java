package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028837 Iterated sum of digits of n is a square.
 * @author Sean A. Irvine
 */
public class A028837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028837() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 4, 9, 10});
  }
}
