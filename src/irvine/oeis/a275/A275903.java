package irvine.oeis.a275;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A275903 Expansion of (1+4*x^2) / (1-5*x+4*x^2-4*x^3).
 * @author Sean A. Irvine
 */
public class A275903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275903() {
    super(new long[] {4, -4, 5}, new long[] {1, 5, 25});
  }
}
