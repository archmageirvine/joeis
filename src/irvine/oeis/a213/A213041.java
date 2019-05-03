package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213041 Number of <code>(w,x,y)</code> with all terms in <code>{0..n}</code> and <code>2|w-x| = max(w,x,y)-min(w,x,y)</code>.
 * @author Sean A. Irvine
 */
public class A213041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213041() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 2, 7, 12});
  }
}
