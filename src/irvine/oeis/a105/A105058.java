package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105058 G.f. (1+8x-x^2)/((x+1)(x^2-6x+1)).
 * @author Sean A. Irvine
 */
public class A105058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105058() {
    super(new long[] {-1, 5, 5}, new long[] {1, 13, 69});
  }
}
