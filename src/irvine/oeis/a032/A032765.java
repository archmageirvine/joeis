package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032765 <code>Floor(n(n+1)(n+2) / (n+ n+1 + n+2)),</code> which equals <code>floor(n(n + 2)/3)</code>.
 * @author Sean A. Irvine
 */
public class A032765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032765() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {0, 1, 2, 5, 8});
  }
}
