package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028195 Expansion of 1/((1-5x)(1-8x)(1-11x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A028195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028195() {
    super(new long[] {-5280, 2636, -471, 36}, new long[] {1, 36, 825, 15380});
  }
}
