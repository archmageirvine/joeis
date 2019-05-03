package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246640 Sequence <code>a(n) = 1 + A001519(n+1)</code> appearing in a certain touching problem for three circles and a chord, together with <code>A246638</code>.
 * @author Sean A. Irvine
 */
public class A246640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246640() {
    super(new long[] {1, -4, 4}, new long[] {2, 3, 6});
  }
}
