package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171067 G.f. <code>-x*(x-1)*(1+x)/((x^2+3*x+1)*(x^2-4*x+1))</code>.
 * @author Sean A. Irvine
 */
public class A171067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171067() {
    super(new long[] {-1, 1, 10, 1}, new long[] {0, 1, 1, 10});
  }
}
