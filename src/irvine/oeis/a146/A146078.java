package irvine.oeis.a146;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A146078 Expansion of 1/(1-x*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A146078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146078() {
    super(new long[] {-9, 1}, new long[] {1, 1});
  }
}
