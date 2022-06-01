package irvine.oeis.a089;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A089108 Convoluted convolved Fibonacci numbers G_4^(r).
 * @author Sean A. Irvine
 */
public class A089108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089108() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {3, 5, 7, 10, 13});
  }
}
