package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212985 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and <code>3w=3x+y</code>.
 * @author Sean A. Irvine
 */
public class A212985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212985() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {1, 2, 3, 7, 9, 11, 18});
  }
}
