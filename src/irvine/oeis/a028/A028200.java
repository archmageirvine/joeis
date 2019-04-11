package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028200 Expansion of <code>1/((1-6x)(1-7x)(1-8x)(1-9x))</code>.
 * @author Sean A. Irvine
 */
public class A028200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028200() {
    super(new long[] {-3024, 1650, -335, 30}, new long[] {1, 30, 565, 8550});
  }
}
