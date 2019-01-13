package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036827.
 * @author Sean A. Irvine
 */
public class A036827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036827() {
    super(new long[] {16, -48, 56, -32, 9}, new long[] {0, 2, 34, 250, 1274});
  }
}
