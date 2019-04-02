package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024121 a(n) = 10^n - n^7.
 * @author Sean A. Irvine
 */
public class A024121 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024121() {
    super(new long[] {10, -81, 288, -588, 756, -630, 336, -108, 18}, new long[] {1, 9, -28, -1187, -6384, 21875, 720064, 9176457, 97902848});
  }
}
