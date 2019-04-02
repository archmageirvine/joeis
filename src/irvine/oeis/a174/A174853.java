package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174853 y-values in the solution to x^2-47*y^2=1.
 * @author Sean A. Irvine
 */
public class A174853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174853() {
    super(new long[] {-1, 96}, new long[] {0, 7});
  }
}
