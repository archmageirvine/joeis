package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212089 Number of <code>(w,x,y,z)</code> with all terms in <code>{1,...,n}</code> and <code>w&gt;=average{x,y,z}</code>.
 * @author Sean A. Irvine
 */
public class A212089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212089() {
    super(new long[] {1, -4, 6, -5, 5, -6, 4}, new long[] {0, 1, 9, 45, 139, 333, 684});
  }
}
