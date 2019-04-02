package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054490 Expansion of (1+5*x)/(1-6*x+x^2).
 * @author Sean A. Irvine
 */
public class A054490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054490() {
    super(new long[] {-1, 6}, new long[] {1, 11});
  }
}
