package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080460 a(1) = 2; for n &gt; 1, a(n) = a(n-1) if n is already in the sequence, a(n) = a(n-1) + 4 otherwise.
 * @author Sean A. Irvine
 */
public class A080460 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080460() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {2, 2, 6, 10, 14});
  }
}
