package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271893.
 * @author Sean A. Irvine
 */
public class A271893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271893() {
    super(new long[] {-6, 4, 2}, new long[] {1, 3, 8});
  }
}
