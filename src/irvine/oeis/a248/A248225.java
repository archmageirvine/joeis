package irvine.oeis.a248;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A248225 a(n) = 6^n - 3^n.
 * @author Sean A. Irvine
 */
public class A248225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248225() {
    super(new long[] {-18, 9}, new long[] {0, 3});
  }
}
