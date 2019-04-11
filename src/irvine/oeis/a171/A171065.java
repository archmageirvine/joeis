package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171065 G.f. <code>-x*(x-1)*(1+x)/(1-x-8*x^2-x^3+x^4)</code>.
 * @author Sean A. Irvine
 */
public class A171065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171065() {
    super(new long[] {-1, 1, 8, 1}, new long[] {0, 1, 1, 8});
  }
}
