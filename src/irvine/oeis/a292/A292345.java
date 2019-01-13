package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292345.
 * @author Sean A. Irvine
 */
public class A292345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292345() {
    super(new long[] {1, -3, 3}, new long[] {96, 352, 736});
  }
}
