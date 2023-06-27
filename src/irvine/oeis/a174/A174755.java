package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174755 x-values in the solution to x^2-47*y^2=1.
 * @author Sean A. Irvine
 */
public class A174755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174755() {
    super(1, new long[] {-1, 96}, new long[] {1, 48});
  }
}
