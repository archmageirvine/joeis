package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212560 Number of <code>(w,x,y,z)</code> with all terms in <code>{1,...,n}</code> and <code>w+x&lt;=y+z</code>.
 * @author Sean A. Irvine
 */
public class A212560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212560() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 11, 50, 150});
  }
}
