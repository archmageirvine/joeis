package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092809 Expansion of (1+x-x^2) / ((1-x^2)*(1-4*x^2)).
 * @author Sean A. Irvine
 */
public class A092809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092809() {
    super(new long[] {-4, 0, 5, 0}, new long[] {1, 1, 4, 5});
  }
}
