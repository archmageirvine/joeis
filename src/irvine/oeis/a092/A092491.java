package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092491 <code>a(n) =</code> 2*A058094(n-2) - 5*A058094(n-3) + A058094(n-4) <code>+ a(n-1)</code> for <code>n &gt;=4</code>.
 * @author Sean A. Irvine
 */
public class A092491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092491() {
    super(new long[] {1, -4, -4, 9, -11, 6}, new long[] {0, 0, 0, 0, 1, 6});
  }
}
