package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182260 Number of ordered triples <code>(w,x,y)</code> with all terms in <code>{1,...,n}</code> and <code>2w&lt;x+y</code>.
 * @author Sean A. Irvine
 */
public class A182260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182260() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 3, 11, 28, 56});
  }
}
