package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167423.
 * @author Sean A. Irvine
 */
public class A167423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167423() {
    super(new long[] {-1, 6, -11, 6}, new long[] {1, -1, -11, -50});
  }
}
