package irvine.oeis.a104;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A104004 Expansion of (1-x) * (1+x) / ((1-2*x)*(1-x-x^2)).
 * @author Sean A. Irvine
 */
public class A104004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104004() {
    super(new long[] {-2, -1, 3}, new long[] {1, 3, 7});
  }
}
