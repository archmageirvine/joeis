package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070207 Expansion of (1-x-5*x^2)/(1-3*x-2*x^2-x^3).
 * @author Sean A. Irvine
 */
public class A070207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070207() {
    super(new long[] {1, 2, 3}, new long[] {1, 2, 3});
  }
}
