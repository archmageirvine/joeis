package irvine.oeis.a068;

import irvine.oeis.LinearRecurrence;

/**
 * A068010.
 * @author Sean A. Irvine
 */
public class A068010 extends LinearRecurrence {

  /** Construct the sequence. */
  public A068010() {
    super(new long[] {-4, 2, 0, 2}, new long[] {1, 1, 2, 4});
  }
}
