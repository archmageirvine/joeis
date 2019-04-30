package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212680 Number of (w,x,y,z) with all terms in <code>{1,...,n}</code> and <code>|x-y|=|y-z|+1</code>.
 * @author Sean A. Irvine
 */
public class A212680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212680() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 0, 4, 18, 56, 120, 228});
  }
}
