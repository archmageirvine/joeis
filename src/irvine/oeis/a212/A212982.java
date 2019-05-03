package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212982 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and <code>w&lt;x+y</code> and <code>x&lt;=y</code>.
 * @author Sean A. Irvine
 */
public class A212982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212982() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 3, 11, 27, 53});
  }
}
