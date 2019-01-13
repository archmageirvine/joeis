package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063823.
 * @author Sean A. Irvine
 */
public class A063823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063823() {
    super(new long[] {-2, 1, 0, 2}, new long[] {1, 2, 2, 2});
  }
}
