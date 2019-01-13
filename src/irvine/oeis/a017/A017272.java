package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017272.
 * @author Sean A. Irvine
 */
public class A017272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017272() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 10000, 160000, 810000, 2560000});
  }
}
