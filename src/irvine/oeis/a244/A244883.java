package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244883 Expansion of <code>(1+6*x+16*x^2+8*x^3+x^4)/(1-x)^8</code>.
 * @author Sean A. Irvine
 */
public class A244883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244883() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 14, 100, 472, 1691, 4988, 12744, 29160});
  }
}
