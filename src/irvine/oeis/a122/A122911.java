package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122911 Expansion of (1+x)*(1-6*x-25*x^2)/((1+2x)(1-4x)(1+8x)(1-16x)).
 * @author Sean A. Irvine
 */
public class A122911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122911() {
    super(new long[] {-1024, -320, 120, 10}, new long[] {1, 5, 139, 1645});
  }
}
