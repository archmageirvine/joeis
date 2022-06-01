package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016241 Expansion of 1/((1-x)*(1-6*x)*(1-7*x)).
 * @author Sean A. Irvine
 */
public class A016241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016241() {
    super(new long[] {42, -55, 14}, new long[] {1, 14, 141});
  }
}
