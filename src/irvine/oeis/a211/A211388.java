package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211388 Expansion of 1/((1-2*x)^6*(1-x)).
 * @author Sean A. Irvine
 */
public class A211388 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211388() {
    super(new long[] {64, -256, 432, -400, 220, -72, 13}, new long[] {1, 13, 97, 545, 2561, 10625, 40193});
  }
}
