package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212570 Number of <code>(w,x,y,z)</code> with all terms in <code>{1,...,n}</code> and <code>|w-x|=|x-y|+|y-z|</code>.
 * @author Sean A. Irvine
 */
public class A212570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212570() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 1, 6, 23, 52, 105});
  }
}
