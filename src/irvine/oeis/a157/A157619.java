package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157619 31250n - 22150.
 * @author Sean A. Irvine
 */
public class A157619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157619() {
    super(new long[] {-1, 2}, new long[] {9100, 40350});
  }
}
