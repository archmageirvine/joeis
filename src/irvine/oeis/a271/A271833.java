package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271833.
 * @author Sean A. Irvine
 */
public class A271833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271833() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 3, 5, 7, 2, 4, 6, 8, 9});
  }
}
