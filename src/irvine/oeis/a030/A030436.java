package irvine.oeis.a030;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A030436 Expansion of (1+x-2*x^2-x^3)/(1-4*x^2+2*x^4).
 * @author Sean A. Irvine
 */
public class A030436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030436() {
    super(new long[] {-2, 0, 4, 0}, new long[] {1, 1, 2, 3});
  }
}
