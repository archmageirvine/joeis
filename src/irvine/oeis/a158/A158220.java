package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158220.
 * @author Sean A. Irvine
 */
public class A158220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158220() {
    super(new long[] {1, -3, 3}, new long[] {171, 680, 1527});
  }
}
