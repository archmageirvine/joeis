package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098657 Expansion of <code>(1-x-4x^2)/((1-2x)(1-8x^2))</code>.
 * @author Sean A. Irvine
 */
public class A098657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098657() {
    super(new long[] {-16, 8, 2}, new long[] {1, 1, 6});
  }
}
