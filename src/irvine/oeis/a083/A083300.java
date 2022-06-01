package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083300 a(n) = (4*7^n + (-3)^n)/5.
 * @author Sean A. Irvine
 */
public class A083300 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083300() {
    super(new long[] {21, 4}, new long[] {1, 5});
  }
}
