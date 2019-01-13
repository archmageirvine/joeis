package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276225.
 * @author Sean A. Irvine
 */
public class A276225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276225() {
    super(new long[] {1, 1, 2}, new long[] {3, 2, 6});
  }
}
