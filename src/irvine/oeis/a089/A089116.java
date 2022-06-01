package irvine.oeis.a089;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A089116 Convoluted convolved Fibonacci numbers G_j^(3).
 * @author Sean A. Irvine
 */
public class A089116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089116() {
    super(new long[] {-1, -3, 0, 4, -3, -3, 7, 3, -3, -4, 0, 3}, new long[] {0, 1, 3, 7, 17, 37, 77, 158, 314, 611, 1174, 2222});
  }
}
