package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083231 a(n) = (3*5^n + (-3)^n)/4.
 * @author Sean A. Irvine
 */
public class A083231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083231() {
    super(new long[] {15, 2}, new long[] {1, 3});
  }
}
