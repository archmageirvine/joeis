package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080460 <code>a(1) = 2;</code> for <code>n &gt; 1, a(n) = a(n-1)</code> if n is already in the sequence, <code>a(n) = a(n-1) + 4</code> otherwise.
 * @author Sean A. Irvine
 */
public class A080460 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080460() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {2, 2, 6, 10, 14});
  }
}
