package irvine.oeis.a214;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A214838 Triangular numbers of the form k^2 + 2.
 * @author Sean A. Irvine
 */
public class A214838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214838() {
    super(new long[] {1, -1, -34, 34, 1}, new long[] {3, 6, 66, 171, 2211});
  }
}
