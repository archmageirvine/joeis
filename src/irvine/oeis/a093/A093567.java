package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093567 Binomial <code>(Binomial (n,2), 3) -</code> Binomial <code>(Binomial (n,3), 2)</code>.
 * @author Sean A. Irvine
 */
public class A093567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093567() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 14, 75, 265, 735, 1736});
  }
}
