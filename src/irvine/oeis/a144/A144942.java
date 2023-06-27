package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144942 Expansion of x^2*(3*x^3+145*x^2-507*x-25) / ((x-1)*(x^2-34*x+1)*(x^2+34*x+1)).
 * @author Sean A. Irvine
 */
public class A144942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144942() {
    super(1, new long[] {1, -1, -1154, 1154, 1}, new long[] {0, 25, 532, 29237, 614312});
  }
}
