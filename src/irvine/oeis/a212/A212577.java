package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212577 Number of <code>(w,x,y,z)</code> with all terms in <code>{1,...,n}</code> and <code>|w-x|=2|x-y|-|y-z|</code>.
 * @author Sean A. Irvine
 */
public class A212577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212577() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {0, 1, 4, 17, 46, 89, 154, 251});
  }
}
