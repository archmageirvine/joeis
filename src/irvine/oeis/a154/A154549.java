package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154549.
 * @author Sean A. Irvine
 */
public class A154549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154549() {
    super(new long[] {-1, 2}, new long[] {111111, 222222});
  }
}
