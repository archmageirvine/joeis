package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081686 a(n) = 7^n - 6^n - 5^n - 4^n + 3*3^n.
 * @author Sean A. Irvine
 */
public class A081686 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081686() {
    super(new long[] {2520, -2754, 1175, -245, 25}, new long[] {1, 1, -1, 19, 467});
  }
}
