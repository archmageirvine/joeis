package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192107 Sum of all the n-digit numbers whose digits are all odd.
 * @author Sean A. Irvine
 */
public class A192107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192107() {
    super(new long[] {-250, 55}, new long[] {25, 1375});
  }
}
