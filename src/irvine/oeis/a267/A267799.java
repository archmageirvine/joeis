package irvine.oeis.a267;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A267799 a(n) = (1 + 2^n + 3^n)/2.
 * @author Sean A. Irvine
 */
public class A267799 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267799() {
    super(new long[] {6, -11, 6}, new long[] {3, 7, 18});
  }
}
