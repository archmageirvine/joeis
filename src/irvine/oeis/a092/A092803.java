package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092803 Expansion of (1-5*x)/((1-2*x)*(1-6*x)).
 * @author Sean A. Irvine
 */
public class A092803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092803() {
    super(new long[] {-12, 8}, new long[] {1, 3});
  }
}
