package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081687 a(n) = 8^n - 7^n - 6^n - 5^n + 3*4^n.
 * @author Sean A. Irvine
 */
public class A081687 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081687() {
    super(new long[] {6720, -5944, 2070, -355, 30}, new long[] {1, 2, 2, 20, 542});
  }
}
