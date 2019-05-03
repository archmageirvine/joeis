package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212563 Number of <code>(w,x,y,z)</code> with all terms in <code>{1,...,n}</code> and <code>w+x&lt;=2y+2z</code>.
 * @author Sean A. Irvine
 */
public class A212563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212563() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 1, 16, 78, 240, 577, 1182});
  }
}
