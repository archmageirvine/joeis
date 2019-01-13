package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213432.
 * @author Sean A. Irvine
 */
public class A213432 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213432() {
    super(new long[] {32, -80, 80, -40, 10}, new long[] {0, 0, 0, 0, 2});
  }
}
