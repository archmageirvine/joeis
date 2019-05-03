package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130483 <code>a(n) = Sum_{k=0..n} (k mod 5) (Partial</code> sums of <code>A010874)</code>.
 * @author Sean A. Irvine
 */
public class A130483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130483() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 3, 6, 10, 10});
  }
}
