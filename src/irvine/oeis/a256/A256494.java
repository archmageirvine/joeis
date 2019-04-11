package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256494 Expansion of <code>-x^2*(x^3+x-1) / ((x-1)*(x+1)*(2*x-1)*(x^2+1))</code>.
 * @author Sean A. Irvine
 */
public class A256494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256494() {
    super(new long[] {-2, 1, 0, 0, 2}, new long[] {0, 1, 1, 2, 3});
  }
}
