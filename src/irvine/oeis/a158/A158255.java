package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158255 a(n) = 289n + 1.
 * @author Sean A. Irvine
 */
public class A158255 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158255() {
    super(1, new long[] {-1, 2}, new long[] {290, 579});
  }
}
