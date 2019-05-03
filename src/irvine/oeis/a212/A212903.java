package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212903 Number of <code>(w,x,y,z)</code> with all terms in <code>{0,...,n}</code> and <code>|w-x|&lt;=|x-y|&lt;=|y-z|</code>.
 * @author Sean A. Irvine
 */
public class A212903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212903() {
    super(new long[] {1, -2, -1, 3, 1, -1, -3, 1, 2}, new long[] {1, 8, 35, 94, 209, 398, 697, 1130, 1743});
  }
}
