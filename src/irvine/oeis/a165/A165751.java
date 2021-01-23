package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165751 a(n) = 4 - 3*2^n.
 * @author Sean A. Irvine
 */
public class A165751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165751() {
    super(new long[] {-2, 3}, new long[] {1, -2});
  }
}
