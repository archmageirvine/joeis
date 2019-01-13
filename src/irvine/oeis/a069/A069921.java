package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069921.
 * @author Sean A. Irvine
 */
public class A069921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069921() {
    super(new long[] {-1, 2, 2}, new long[] {1, 5, 10});
  }
}
