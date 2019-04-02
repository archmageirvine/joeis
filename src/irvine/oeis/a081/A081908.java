package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081908 a(n) = 2^n*(n^2 - n + 8)/8.
 * @author Sean A. Irvine
 */
public class A081908 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081908() {
    super(new long[] {8, -12, 6}, new long[] {1, 2, 5});
  }
}
