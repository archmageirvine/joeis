package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019943 Expansion of <code>1/((1-5*x)*(1-7*x)*(1-9*x))</code>.
 * @author Sean A. Irvine
 */
public class A019943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019943() {
    super(new long[] {315, -143, 21}, new long[] {1, 21, 298});
  }
}
