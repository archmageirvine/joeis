package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021379 Expansion of 1/((1-x)*(1-3*x)*(1-4*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A021379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021379() {
    super(new long[] {-108, 183, -91, 17}, new long[] {1, 17, 198, 2002});
  }
}
