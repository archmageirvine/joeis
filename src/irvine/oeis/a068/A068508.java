package irvine.oeis.a068;

import irvine.oeis.LinearRecurrence;

/**
 * A068508.
 * @author Sean A. Irvine
 */
public class A068508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A068508() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 2, 3, 5, 4, 3});
  }
}
