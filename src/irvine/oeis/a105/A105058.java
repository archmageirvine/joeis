package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105058 Expansion of g.f. (1+8*x-x^2)/((1+x)*(1-6*x+x^2)).
 * @author Sean A. Irvine
 */
public class A105058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105058() {
    super(new long[] {-1, 5, 5}, new long[] {1, 13, 69});
  }
}
