package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228536 y-values in the solution to the Pell equation x^2 - 53*y^2 = -1.
 * @author Sean A. Irvine
 */
public class A228536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228536() {
    super(new long[] {-1, 132498}, new long[] {25, 3312425});
  }
}
