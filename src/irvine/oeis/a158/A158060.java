package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158060 a(n) = 25*n + 1.
 * @author Sean A. Irvine
 */
public class A158060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158060() {
    super(1, new long[] {-1, 2}, new long[] {26, 51});
  }
}
