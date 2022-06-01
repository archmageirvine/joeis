package irvine.oeis.a064;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A064747 a(n) = n*9^n + 1.
 * @author Sean A. Irvine
 */
public class A064747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064747() {
    super(new long[] {81, -99, 19}, new long[] {1, 10, 163});
  }
}
