package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152223 a(n) = -4*a(n-1) + 6*a(n-2) for n &gt; 1 with a(0) = 1 and a(1) = -6.
 * @author Sean A. Irvine
 */
public class A152223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152223() {
    super(new long[] {6, -4}, new long[] {1, -6});
  }
}
