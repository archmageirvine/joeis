package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238824.
 * @author Sean A. Irvine
 */
public class A238824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238824() {
    super(new long[] {-1, 2, 4, 2, -3, -4, 3, 2}, new long[] {0, 1, 1, 3, 7, 17, 43, 105});
  }
}
