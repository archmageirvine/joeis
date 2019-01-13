package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265724.
 * @author Sean A. Irvine
 */
public class A265724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265724() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 3, 7, 10, 18});
  }
}
