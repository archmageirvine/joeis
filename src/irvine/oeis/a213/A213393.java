package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213393 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and <code>2*max(w,x,y) &gt; 3*min(w,x,y)</code>.
 * @author Sean A. Irvine
 */
public class A213393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213393() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {0, 6, 24, 54, 108, 192, 300, 450});
  }
}
