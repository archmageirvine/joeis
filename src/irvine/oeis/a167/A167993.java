package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167993 Expansion of x^2/((3*x-1)*(3*x^2-1)).
 * @author Sean A. Irvine
 */
public class A167993 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167993() {
    super(new long[] {-9, 3, 3}, new long[] {0, 0, 1});
  }
}
