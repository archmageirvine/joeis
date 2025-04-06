package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093135 Expansion of g.f. (1-8*x)/((1-x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A093135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093135() {
    super(new long[] {-10, 11}, new long[] {1, 3});
  }
}
