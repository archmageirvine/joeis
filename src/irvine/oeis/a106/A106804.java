package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106804 G.f.: <code>(2-9x-4x^2)*x / [(1-5x+x^2)*(1-5x-x^2)]</code>.
 * @author Sean A. Irvine
 */
public class A106804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106804() {
    super(new long[] {1, 0, -25, 10}, new long[] {0, 2, 11, 56});
  }
}
