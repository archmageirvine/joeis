package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081680 a(n) = (7^n - 6^n - 5^n - 4^n + 4*3^n)/2.
 * @author Sean A. Irvine
 */
public class A081680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081680() {
    super(new long[] {2520, -2754, 1175, -245, 25}, new long[] {1, 2, 4, 23, 274});
  }
}
