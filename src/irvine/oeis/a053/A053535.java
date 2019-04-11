package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053535 Expansion of <code>1/((1+3*x)*(1-9*x))</code>.
 * @author Sean A. Irvine
 */
public class A053535 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053535() {
    super(new long[] {27, 6}, new long[] {1, 6});
  }
}
