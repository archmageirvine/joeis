package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014743 Expansion of <code>(1+x)/(1-x-x^2-x^4-x^5)</code>.
 * @author Sean A. Irvine
 */
public class A014743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014743() {
    super(new long[] {1, 1, 0, 1, 1}, new long[] {1, 2, 3, 5, 9});
  }
}
