package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025947 Expansion of <code>1/((1-2x)(1-3x)(1-7x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A025947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025947() {
    super(new long[] {-504, 534, -185, 24}, new long[] {1, 24, 391, 5478});
  }
}
