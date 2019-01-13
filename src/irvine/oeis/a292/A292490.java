package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292490.
 * @author Sean A. Irvine
 */
public class A292490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292490() {
    super(new long[] {7, 17, 0, 5}, new long[] {1, 11, 68, 365});
  }
}
