package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083585 (8*5^n - 5*2^n)/3.
 * @author Sean A. Irvine
 */
public class A083585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083585() {
    super(new long[] {-10, 7}, new long[] {1, 10});
  }
}
