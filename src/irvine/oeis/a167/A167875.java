package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167875.
 * @author Sean A. Irvine
 */
public class A167875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167875() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 4, 11, 24});
  }
}
