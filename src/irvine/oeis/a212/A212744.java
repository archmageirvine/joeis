package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212744 Number of <code>(w,x,y,z)</code> with all terms in <code>{0,...,n}</code> and <code>w=max{w,x,y,z}-min{w,x,y,z}</code>; i.e., the range of <code>(w,x,y,z)</code> is its first term.
 * @author Sean A. Irvine
 */
public class A212744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212744() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 8, 34, 83, 181, 314, 532});
  }
}
