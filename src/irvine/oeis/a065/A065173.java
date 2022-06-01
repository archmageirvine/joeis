package irvine.oeis.a065;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A065173 Site swap sequence that rises infinitely after t=0. The associated delta sequence p(t)-t for the permutation of Z: A065171.
 * @author Sean A. Irvine
 */
public class A065173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065173() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 1, 2, 2, 1, 3, 6, 4});
  }
}
