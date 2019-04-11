package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122508 G.f.: <code>1/[(1-2x)(1+2x+3x^2)]</code>.
 * @author Sean A. Irvine
 */
public class A122508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122508() {
    super(new long[] {6, 1, 0}, new long[] {1, 0, 1});
  }
}
