package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212968 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and <code>w&gt;=range{w,x,y}</code>.
 * @author Sean A. Irvine
 */
public class A212968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212968() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 5, 17, 38, 75, 127});
  }
}
