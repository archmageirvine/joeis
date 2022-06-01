package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154627 Expansion of (1-5x)/(1-8x+4x^2).
 * @author Sean A. Irvine
 */
public class A154627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154627() {
    super(new long[] {-4, 8}, new long[] {1, 3});
  }
}
