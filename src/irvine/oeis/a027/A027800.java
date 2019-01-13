package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027800.
 * @author Sean A. Irvine
 */
public class A027800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027800() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 10, 45, 140, 350, 756});
  }
}
