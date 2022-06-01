package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094627 Expansion of (1+x)^2/((1-x)*(1-10*x^2)).
 * @author Sean A. Irvine
 */
public class A094627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094627() {
    super(new long[] {-10, 10, 1}, new long[] {1, 3, 14});
  }
}
