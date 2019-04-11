package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188050 <code>a(n) =</code> A016755(n) - A001845(n).
 * @author Sean A. Irvine
 */
public class A188050 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188050() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 20, 100, 280});
  }
}
