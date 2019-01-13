package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089068.
 * @author Sean A. Irvine
 */
public class A089068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089068() {
    super(new long[] {-1, 0, 0, 2}, new long[] {0, 0, 1, 3});
  }
}
