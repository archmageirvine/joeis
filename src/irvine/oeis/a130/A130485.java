package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130485 <code>a(n) = Sum_{k=0..n} (k mod 7)</code> (Partial sums of <code>A010876)</code>.
 * @author Sean A. Irvine
 */
public class A130485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130485() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 3, 6, 10, 15, 21, 21});
  }
}
