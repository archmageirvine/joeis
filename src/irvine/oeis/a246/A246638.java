package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246638 Sequence <code>a(n) = 2 + 3*A001519(n+1)</code> appearing in a certain four circle touching problem together with <code>A246639</code>.
 * @author Sean A. Irvine
 */
public class A246638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246638() {
    super(new long[] {1, -4, 4}, new long[] {5, 8, 17});
  }
}
