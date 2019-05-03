package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212960 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and <code>|w-x| != |x-y|</code>.
 * @author Sean A. Irvine
 */
public class A212960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212960() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 4, 16, 44, 92});
  }
}
