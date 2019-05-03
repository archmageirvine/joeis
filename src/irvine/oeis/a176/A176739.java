package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176739 Expansion of <code>1/(1-2*x^2-4*x^3). (2,4)-Padovan</code> sequence.
 * @author Sean A. Irvine
 */
public class A176739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176739() {
    super(new long[] {4, 2, 0}, new long[] {1, 0, 2});
  }
}
