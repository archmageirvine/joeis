package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121990 Expansion of x*(1+9*x+2*x^2)/((1-x)*(1-3*x+x^2)).
 * @author Sean A. Irvine
 */
public class A121990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121990() {
    super(1, new long[] {1, -4, 4}, new long[] {1, 13, 50});
  }
}
