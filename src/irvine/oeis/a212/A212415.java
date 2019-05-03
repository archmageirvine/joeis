package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212415 Number of <code>(w,x,y,z)</code> with all terms in <code>{1,...,n}</code> and <code>w&lt;x&gt;=y&lt;=z</code>.
 * @author Sean A. Irvine
 */
public class A212415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212415() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 3, 17, 55});
  }
}
