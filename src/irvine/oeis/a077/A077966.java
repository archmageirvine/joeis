package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077966 Expansion of <code>1/(1+2*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A077966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077966() {
    super(new long[] {-2, 0}, new long[] {1, 0});
  }
}
