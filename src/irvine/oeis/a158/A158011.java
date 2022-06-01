package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158011 a(n) = 512n - 1.
 * @author Sean A. Irvine
 */
public class A158011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158011() {
    super(new long[] {-1, 2}, new long[] {511, 1023});
  }
}
