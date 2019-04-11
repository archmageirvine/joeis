package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122910 Expansion of <code>(1-2x-3x^2)/((1-2x)(1+4x)(1-8x))</code>.
 * @author Sean A. Irvine
 */
public class A122910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122910() {
    super(new long[] {-64, 24, 6}, new long[] {1, 4, 45});
  }
}
