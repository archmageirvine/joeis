package irvine.oeis.a255;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A255368 a(n) = -(-1)^n * 2 * n / 3 if n divisible by 3, a(n) = -(-1)^n * n otherwise.
 * @author Sean A. Irvine
 */
public class A255368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255368() {
    super(new long[] {-1, 0, 0, -2, 0, 0}, new long[] {0, 1, -2, 2, -4, 5});
  }
}
