package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213388 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and <code>2|w-x| &gt;= max(w,x,y)-min(w,x,y)</code>.
 * @author Sean A. Irvine
 */
public class A213388 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213388() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 6, 21, 48, 93});
  }
}
