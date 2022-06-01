package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103750 Expansion of (1+2*x^3)/(1-x+x^3-2*x^4).
 * @author Sean A. Irvine
 */
public class A103750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103750() {
    super(new long[] {2, -1, 0, 1}, new long[] {1, 1, 1, 2});
  }
}
