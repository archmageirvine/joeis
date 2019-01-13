package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164462.
 * @author Sean A. Irvine
 */
public class A164462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164462() {
    super(new long[] {-1, 0, 1, -1, 2}, new long[] {13, 20, 33, 55, 89});
  }
}
