package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176376 y-values in the solution to x^2-69*y^2=1.
 * @author Sean A. Irvine
 */
public class A176376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176376() {
    super(new long[] {-1, 15550}, new long[] {0, 936});
  }
}
