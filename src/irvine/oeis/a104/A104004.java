package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104004 Expansion of (1-x)(1+x)/((2x-1)(x^2+x-1)).
 * @author Sean A. Irvine
 */
public class A104004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104004() {
    super(new long[] {-2, -1, 3}, new long[] {1, 3, 7});
  }
}
