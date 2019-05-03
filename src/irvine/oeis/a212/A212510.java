package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212510 Number of <code>(w,x,y,z)</code> with all terms in <code>{1,...,n}</code> and <code>w&lt;2x</code> and <code>y&gt;3z</code>.
 * @author Sean A. Irvine
 */
public class A212510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212510() {
    super(new long[] {1, 0, -2, -2, 1, 4, 0, -2, 0, 2, 0, -4, -1, 2, 2, 0}, new long[] {0, 0, 0, 0, 12, 38, 81, 185, 336, 549, 900, 1365, 1944, 2794, 3822, 5070});
  }
}
