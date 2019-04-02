package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157434 4n^2 + 79n + 390.
 * @author Sean A. Irvine
 */
public class A157434 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157434() {
    super(new long[] {1, -3, 3}, new long[] {473, 564, 663});
  }
}
