package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211013.
 * @author Sean A. Irvine
 */
public class A211013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211013() {
    super(new long[] {1, -3, 3}, new long[] {0, 10, 31});
  }
}
