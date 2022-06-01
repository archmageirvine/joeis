package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271896 Expansion of (x-1)^2 / ( 1-4*x+5*x^2-4*x^3 ).
 * @author Sean A. Irvine
 */
public class A271896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271896() {
    super(new long[] {4, -5, 4}, new long[] {1, 2, 4});
  }
}
