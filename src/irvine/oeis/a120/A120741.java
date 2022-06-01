package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120741 a(n) = (7^n - 1)/2.
 * @author Sean A. Irvine
 */
public class A120741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120741() {
    super(new long[] {-7, 8}, new long[] {0, 3});
  }
}
