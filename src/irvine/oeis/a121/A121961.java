package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121961 Expansion of g.f.: 1/( (1+2*x)*(1-2*x-4*x^2)*(1-2*x^2)^2 ).
 * @author Sean A. Irvine
 */
public class A121961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121961() {
    super(new long[] {32, 32, -32, -36, 8, 12, 0}, new long[] {1, 0, 12, 8, 108, 160, 960});
  }
}
