package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120775 a(n) = 3*a(n-1) + 5*a(n-2) + a(n-3).
 * @author Sean A. Irvine
 */
public class A120775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120775() {
    super(1, new long[] {1, 5, 3}, new long[] {1, 6, 23});
  }
}
