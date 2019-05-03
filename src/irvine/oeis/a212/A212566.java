package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212566 Number of <code>(w,x,y,z)</code> with all terms in <code>{1,...,n}</code> and <code>w+x=3y+3z</code>.
 * @author Sean A. Irvine
 */
public class A212566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212566() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {0, 0, 0, 1, 3, 9, 16, 26});
  }
}
