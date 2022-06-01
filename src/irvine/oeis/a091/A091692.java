package irvine.oeis.a091;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A091692 (10^n-1) * (n+9) / 9.
 * @author Sean A. Irvine
 */
public class A091692 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091692() {
    super(new long[] {-100, 220, -141, 22}, new long[] {0, 10, 121, 1332});
  }
}
