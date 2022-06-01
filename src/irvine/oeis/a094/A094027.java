package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094027 Expansion of x(1+100x)/((1-x^2)(1-100x^2)).
 * @author Sean A. Irvine
 */
public class A094027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094027() {
    super(new long[] {-100, 0, 101, 0}, new long[] {0, 1, 100, 101});
  }
}
