package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167548.
 * @author Sean A. Irvine
 */
public class A167548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167548() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {24, 240, 960, 2688, 6144});
  }
}
