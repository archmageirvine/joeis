package irvine.oeis.a275;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A275906 Expansion of (1+x+x^2) / (1-4*x-4*x^2-x^3).
 * @author Sean A. Irvine
 */
public class A275906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275906() {
    super(new long[] {1, 4, 4}, new long[] {1, 5, 25});
  }
}
