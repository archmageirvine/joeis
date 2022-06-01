package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081909 a(n) = 3^n(n^2 - n + 18)/18.
 * @author Sean A. Irvine
 */
public class A081909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081909() {
    super(new long[] {27, -27, 9}, new long[] {1, 3, 10});
  }
}
