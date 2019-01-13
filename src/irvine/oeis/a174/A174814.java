package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174814.
 * @author Sean A. Irvine
 */
public class A174814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174814() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 4, 22, 64});
  }
}
