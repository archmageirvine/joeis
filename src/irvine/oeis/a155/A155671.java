package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155671 a(n) = 10^n - 9^n + 1^n.
 * @author Sean A. Irvine
 */
public class A155671 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155671() {
    super(new long[] {90, -109, 20}, new long[] {1, 2, 20});
  }
}
