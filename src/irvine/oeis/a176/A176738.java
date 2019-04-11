package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176738 Expansion of <code>1 / ((1+x)*(1-x-4*x^2)). (5</code>,4)-Padovan sequence.
 * @author Sean A. Irvine
 */
public class A176738 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176738() {
    super(new long[] {4, 5, 0}, new long[] {1, 0, 5});
  }
}
