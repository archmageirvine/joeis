package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291984 Expansion of <code>1/((1+x)*(1+x^2)*(1+x^3)*(1+x^4))</code>.
 * @author Sean A. Irvine
 */
public class A291984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291984() {
    super(new long[] {-1, -1, -1, -2, -2, -2, -2, -2, -1, -1}, new long[] {1, -1, 0, -1, 1, 0, 1, -1, 1, -2});
  }
}
