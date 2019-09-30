package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027974 <code>a(n) = Sum_{i=0..n} Sum_{j=0..i} T(i,j)</code>, T given by <code>A027960</code>.
 * @author Sean A. Irvine
 */
public class A027974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027974() {
    super(new long[] {-2, -1, 3}, new long[] {1, 5, 14});
  }
}
