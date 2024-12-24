package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016909 Expansion of 1/((1-3*x)*(1-4*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A016909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016909() {
    super(new long[] {108, -75, 16}, new long[] {1, 16, 181});
  }
}
