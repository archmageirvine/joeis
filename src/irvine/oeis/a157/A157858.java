package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157858 a(n) = 1728000*n - 240.
 * @author Sean A. Irvine
 */
public class A157858 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157858() {
    super(new long[] {-1, 2}, new long[] {1727760, 3455760});
  }
}
