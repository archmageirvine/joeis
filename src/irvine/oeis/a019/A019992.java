package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019992.
 * @author Sean A. Irvine
 */
public class A019992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019992() {
    super(new long[] {-1, 0, -1, 1, 4}, new long[] {5, 21, 88, 368, 1538});
  }
}
