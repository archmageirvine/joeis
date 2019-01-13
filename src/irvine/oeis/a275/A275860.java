package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275860.
 * @author Sean A. Irvine
 */
public class A275860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275860() {
    super(new long[] {-1, 1, 0, -4, 0, 0, 5}, new long[] {1, 1, 7, 33, 164, 813, 4039});
  }
}
