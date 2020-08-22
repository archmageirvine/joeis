package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129905 Expansion of g.f.: (1-x)*(1+2*x)/((1+x)*(1-3*x+x^2)).
 * @author Sean A. Irvine
 */
public class A129905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129905() {
    super(new long[] {-1, 2, 2}, new long[] {1, 3, 6});
  }
}
