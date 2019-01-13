package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246416.
 * @author Sean A. Irvine
 */
public class A246416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246416() {
    super(new long[] {-1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, new long[] {0, 1, 1, 3, 2, 5, 3, 7, 2, 9, 5, 11});
  }
}
