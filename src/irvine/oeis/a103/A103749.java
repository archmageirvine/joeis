package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103749 Expansion of x*(1+2*x)/(1+x+x^2-2*x^3).
 * @author Sean A. Irvine
 */
public class A103749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103749() {
    super(new long[] {2, -1, -1}, new long[] {0, 1, 1});
  }
}
