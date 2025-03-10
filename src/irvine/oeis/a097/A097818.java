package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097818 Expansion of (8+10*x)/((1-x)*(1-100*x)).
 * @author Sean A. Irvine
 */
public class A097818 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097818() {
    super(new long[] {-100, 101}, new long[] {8, 818});
  }
}
