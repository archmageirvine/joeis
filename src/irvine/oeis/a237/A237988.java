package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237988.
 * @author Sean A. Irvine
 */
public class A237988 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237988() {
    super(new long[] {1, 0, 0, 3, 0, 0, 3, 0, 0}, new long[] {0, 1, 1, 2, 2, 3, 7, 9, 11});
  }
}
