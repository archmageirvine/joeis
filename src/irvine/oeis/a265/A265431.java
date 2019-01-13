package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265431.
 * @author Sean A. Irvine
 */
public class A265431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265431() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {0, 1, 4, 7, 12, 18});
  }
}
