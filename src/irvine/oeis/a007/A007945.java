package irvine.oeis.a007;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A007945 Expansion of <code>(2-x-2*x^2)/((1-x)*(1-x+x^2))</code>.
 * @author Sean A. Irvine
 */
public class A007945 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A007945() {
    super(new long[] {2, -1, -2}, new long[] {1, -2, 2, -1});
  }
}
