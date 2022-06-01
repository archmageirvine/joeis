package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020526 a(n) = 6th Euler polynomial evaluated at 2^n.
 * @author Sean A. Irvine
 */
public class A020526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020526() {
    super(new long[] {-32768, 22016, -3024, 106}, new long[] {0, 2, 1332, 166376});
  }
}
