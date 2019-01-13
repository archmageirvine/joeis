package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187069.
 * @author Sean A. Irvine
 */
public class A187069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187069() {
    super(new long[] {-1, 0, 1, 0, 2, 0}, new long[] {0, 1, 0, 1, 1, 2});
  }
}
