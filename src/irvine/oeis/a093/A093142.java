package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093142 Expansion of g.f. (1-5*x)/((1-x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A093142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093142() {
    super(new long[] {-10, 11}, new long[] {1, 6});
  }
}
