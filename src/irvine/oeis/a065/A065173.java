package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065173.
 * @author Sean A. Irvine
 */
public class A065173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065173() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 1, 2, 2, 1, 3, 6, 4});
  }
}
