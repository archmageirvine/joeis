package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255563 a(n) = -3 * n/4 if n divisible by 4, a(n) = -(-1)^n * n otherwise.
 * @author Sean A. Irvine
 */
public class A255563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255563() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 1, -2, 3, -3, 5, -6, 7});
  }
}
