package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106664 G.f. <code>(1-3*x+x^2)/((x-1)*(x+1)*(2*x^2-2*x+1))</code>.
 * @author Sean A. Irvine
 */
public class A106664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106664() {
    super(new long[] {2, -2, -1, 2}, new long[] {-1, 1, 2, 5});
  }
}
