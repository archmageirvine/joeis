package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176375 x-values in the solution to x^2-69*y^2=1.
 * @author Sean A. Irvine
 */
public class A176375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176375() {
    super(new long[] {-1, 15550}, new long[] {1, 7775});
  }
}
