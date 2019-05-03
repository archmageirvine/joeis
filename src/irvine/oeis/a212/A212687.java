package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212687 Number of <code>(w,x,y,z)</code> with all terms in <code>{1,...,n}</code> and <code>2|w-x|&lt;n+|y-z|</code>.
 * @author Sean A. Irvine
 */
public class A212687 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212687() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 1, 12, 67, 212, 527, 1096});
  }
}
