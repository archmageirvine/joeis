package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027974 a(n) = Sum_{i=0..n} Sum_{j=0..i} T(i,j), T given by A027960.
 * @author Sean A. Irvine
 */
public class A027974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027974() {
    super(new long[] {-2, -1, 3}, new long[] {1, 5, 14});
  }
}
