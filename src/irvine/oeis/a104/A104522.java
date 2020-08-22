package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104522 Expansion of (-1+x+3*x^2-x^3)/((x+1)(3*x-1)(x-1)^2).
 * @author Sean A. Irvine
 */
public class A104522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104522() {
    super(new long[] {3, -4, -2, 4}, new long[] {1, 3, 7, 19});
  }
}
