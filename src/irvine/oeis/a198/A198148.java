package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198148.
 * @author Sean A. Irvine
 */
public class A198148 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198148() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 3, 1, 15, 3, 35});
  }
}
