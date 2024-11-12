package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016163 Expansion of 1/((1-5*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A016163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016163() {
    super(new long[] {-45, 14}, new long[] {1, 14});
  }
}
