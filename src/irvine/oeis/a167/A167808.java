package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167808.
 * @author Sean A. Irvine
 */
public class A167808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167808() {
    super(new long[] {1, 0, 0, 4, 0, 0}, new long[] {0, 1, 1, 1, 3, 5});
  }
}
