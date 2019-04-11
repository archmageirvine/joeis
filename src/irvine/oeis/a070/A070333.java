package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070333 Expansion of <code>(1+x)*(1-x+x^2)/( (1-x)^4*(1+x+x^2) )</code>.
 * @author Sean A. Irvine
 */
public class A070333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070333() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {1, 3, 6, 12, 21, 33});
  }
}
