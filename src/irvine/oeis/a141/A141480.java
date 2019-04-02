package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141480 Binomial(n+2,3)*5^3.
 * @author Sean A. Irvine
 */
public class A141480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141480() {
    super(new long[] {-1, 4, -6, 4}, new long[] {125, 500, 1250, 2500});
  }
}
