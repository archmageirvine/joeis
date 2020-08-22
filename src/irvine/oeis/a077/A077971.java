package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077971 Expansion of 1/(1+x-x^2-2*x^3).
 * @author Sean A. Irvine
 */
public class A077971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077971() {
    super(new long[] {2, 1, -1}, new long[] {1, -1, 2});
  }
}
