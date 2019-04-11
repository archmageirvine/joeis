package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028219 Expansion of <code>1/((1-6x)(1-10x)(1-11x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A028219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028219() {
    super(new long[] {-7920, 3492, -560, 39}, new long[] {1, 39, 961, 19131});
  }
}
