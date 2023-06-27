package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122995 Expansion of x*(1+4*x)/(1-x-25*x^2).
 * @author Sean A. Irvine
 */
public class A122995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122995() {
    super(1, new long[] {25, 1}, new long[] {1, 5});
  }
}
