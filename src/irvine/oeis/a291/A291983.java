package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291983 Expansion of <code>1/((1+x)*(1+x^2)*(1+x^3))</code>.
 * @author Sean A. Irvine
 */
public class A291983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291983() {
    super(new long[] {-1, -1, -1, -2, -1, -1}, new long[] {1, -1, 0, -1, 2, -1});
  }
}
