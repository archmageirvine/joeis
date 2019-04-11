package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053537 Expansion of <code>1/((1+5*x)*(1-15*x))</code>.
 * @author Sean A. Irvine
 */
public class A053537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053537() {
    super(new long[] {75, 10}, new long[] {1, 10});
  }
}
