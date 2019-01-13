package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275858.
 * @author Sean A. Irvine
 */
public class A275858 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275858() {
    super(new long[] {-1, -1, -2, 1}, new long[] {1, 1, -1, -4});
  }
}
