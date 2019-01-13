package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033082.
 * @author Sean A. Irvine
 */
public class A033082 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033082() {
    super(new long[] {-4, 0, 0, 1, 0, 0, 4, 0, 0}, new long[] {1, 2, 3, 7, 8, 13, 29, 34, 55});
  }
}
