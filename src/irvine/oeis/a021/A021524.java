package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021524 Expansion of 1/((1-x)(1-3x)(1-6x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A021524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021524() {
    super(new long[] {-198, 315, -137, 21}, new long[] {1, 21, 304, 3822});
  }
}
