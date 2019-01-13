package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247215.
 * @author Sean A. Irvine
 */
public class A247215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247215() {
    super(new long[] {1, -35, 35}, new long[] {0, 8, 280});
  }
}
