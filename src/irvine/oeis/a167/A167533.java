package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167533.
 * @author Sean A. Irvine
 */
public class A167533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167533() {
    super(new long[] {-1, 1, 1}, new long[] {12, 59, 83});
  }
}
