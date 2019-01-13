package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087504.
 * @author Sean A. Irvine
 */
public class A087504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087504() {
    super(new long[] {-1, 1, 0, -1, 2, -1, 0, 1}, new long[] {1, 1, 1, 1, 2, 2, 3, 3});
  }
}
