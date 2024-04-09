package irvine.oeis.a179;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A179980 a(n) = 10*a(n-1) - (-1)^n * n, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A179980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179980() {
    super(1, new long[] {10, 19, 8}, new long[] {1, 8, 83});
  }
}
