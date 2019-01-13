package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111989.
 * @author Sean A. Irvine
 */
public class A111989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111989() {
    super(new long[] {-8, 0, 6}, new long[] {1, 6, 36});
  }
}
