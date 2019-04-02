package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097166 Expansion of (1+2*x)/((1-x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A097166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097166() {
    super(new long[] {-10, 11}, new long[] {1, 13});
  }
}
