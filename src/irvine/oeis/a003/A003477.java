package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003477 Expansion of <code>1/((1-2x)(1+x^2)(1-x-2x^3))</code>.
 * @author Sean A. Irvine
 */
public class A003477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003477() {
    super(new long[] {-4, 2, -6, 5, -3, 3}, new long[] {1, 3, 6, 14, 33, 71});
  }
}

