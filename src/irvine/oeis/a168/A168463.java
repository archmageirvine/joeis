package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168463 <code>a(n) = 5 + 11*floor(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A168463 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168463() {
    super(new long[] {-1, 1, 1}, new long[] {5, 16, 16});
  }
}
