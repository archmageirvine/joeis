package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021524 Expansion of 1/((1-x)*(1-3*x)*(1-6*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A021524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021524() {
    super(new long[] {-198, 315, -137, 21}, new long[] {1, 21, 304, 3822});
  }
}
