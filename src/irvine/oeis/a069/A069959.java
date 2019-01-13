package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069959.
 * @author Sean A. Irvine
 */
public class A069959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069959() {
    super(new long[] {-1, 2, 2}, new long[] {1, 5, 8});
  }
}
