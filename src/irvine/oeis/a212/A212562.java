package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212562 Number of <code>(w,x,y,z)</code> with all terms in <code>{1,...,n}</code> and <code>w+x&lt;2y+2z</code>.
 * @author Sean A. Irvine
 */
public class A212562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212562() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 1, 15, 73, 228, 551, 1137});
  }
}
