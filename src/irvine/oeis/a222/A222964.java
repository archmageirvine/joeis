package irvine.oeis.a222;

import irvine.oeis.LinearRecurrence;

/**
 * A222964 Numbers n such that <code>25n+36</code> is a square.
 * @author Sean A. Irvine
 */
public class A222964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222964() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 13, 37, 76, 124});
  }
}
