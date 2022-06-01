package irvine.oeis.a019;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A019869 Expansion of 1/((1-5*x)*(1-6*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A019869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019869() {
    super(new long[] {360, -162, 23}, new long[] {1, 23, 367});
  }
}
