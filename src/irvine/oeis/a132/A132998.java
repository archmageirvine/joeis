package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132998.
 * @author Sean A. Irvine
 */
public class A132998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132998() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, -1, 4, 45, 176});
  }
}
