package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279230 Expansion of <code>1/((1-x)^2*(1-2*x+2*x^2))</code>.
 * @author Sean A. Irvine
 */
public class A279230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279230() {
    super(new long[] {-2, 6, -7, 4}, new long[] {1, 4, 9, 14});
  }
}
