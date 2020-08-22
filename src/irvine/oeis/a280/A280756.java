package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280756 Expansion of (1 + 2*x)/(1 - x - 4*x^2 + x^4).
 * @author Sean A. Irvine
 */
public class A280756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280756() {
    super(new long[] {-1, 0, 4, 1}, new long[] {1, 3, 7, 19});
  }
}
