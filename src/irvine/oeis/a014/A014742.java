package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014742 Expansion of (1+x^2)/(1 - 2*x - 2*x^2 + x^3).
 * @author Sean A. Irvine
 */
public class A014742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014742() {
    super(new long[] {-1, 2, 2}, new long[] {1, 2, 7});
  }
}
