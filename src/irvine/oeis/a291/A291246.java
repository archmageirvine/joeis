package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291246.
 * @author Sean A. Irvine
 */
public class A291246 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291246() {
    super(new long[] {-1, -6, 1, 6}, new long[] {6, 35, 210, 1259});
  }
}
