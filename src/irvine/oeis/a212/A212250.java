package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212250 Number of <code>(w,x,y,z)</code> with all terms in <code>{1,...,n}</code> and <code>3w&gt;=x+y+z+n</code>.
 * @author Sean A. Irvine
 */
public class A212250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212250() {
    super(new long[] {1, -4, 6, -5, 5, -6, 4}, new long[] {0, 0, 4, 18, 54, 129, 262});
  }
}
