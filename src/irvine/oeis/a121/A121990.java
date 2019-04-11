package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121990 Expansion of <code>x*(1+9*x+2*x^2)/((1-x)*(x^2-3*x+1))</code>.
 * @author Sean A. Irvine
 */
public class A121990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121990() {
    super(new long[] {1, -4, 4}, new long[] {1, 13, 50});
  }
}
