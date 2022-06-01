package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022845 Expansion of 1/((1-x)*(1-5*x)*(1-9*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A022845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022845() {
    super(new long[] {-450, 635, -209, 25}, new long[] {1, 25, 416, 5810});
  }
}
