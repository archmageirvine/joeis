package irvine.oeis.a255;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A255465 a(n) = A255464(2^n-1).
 * @author Sean A. Irvine
 */
public class A255465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255465() {
    super(new long[] {4, 3}, new long[] {1, 6});
  }
}
