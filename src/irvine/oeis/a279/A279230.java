package irvine.oeis.a279;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A279230 Expansion of 1/((1-x)^2*(1-2*x+2*x^2)).
 * @author Sean A. Irvine
 */
public class A279230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279230() {
    super(new long[] {-2, 6, -7, 4}, new long[] {1, 4, 9, 14});
  }
}
