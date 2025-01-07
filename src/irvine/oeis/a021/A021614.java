package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021614 Expansion of 1/((1-x)*(1-3*x)*(1-7*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A021614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021614() {
    super(new long[] {-231, 362, -152, 22}, new long[] {1, 22, 332, 4322});
  }
}
