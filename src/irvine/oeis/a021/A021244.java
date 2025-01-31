package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021244 Expansion of 1/((1-x)*(1-2*x)*(1-7*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A021244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021244() {
    super(new long[] {-154, 267, -133, 21}, new long[] {1, 21, 308, 3942});
  }
}
