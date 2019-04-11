package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057590 Numbers of the form <code>n*(n^3+-1)/2</code>.
 * @author Sean A. Irvine
 */
public class A057590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057590() {
    super(new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1}, new long[] {0, 1, 7, 9, 39, 42, 126, 130, 310});
  }
}
