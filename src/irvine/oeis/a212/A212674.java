package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212674 Number of <code>(w,x,y,z)</code> with all terms in <code>{1,...,n}</code> and <code>w&gt;|x-y|+|y-z|</code>.
 * @author Sean A. Irvine
 */
public class A212674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212674() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {0, 1, 8, 35, 104, 247});
  }
}
