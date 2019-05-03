package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213486 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and <code>|w-x|+|x-y|+|y-w| &gt; w+x+y</code>.
 * @author Sean A. Irvine
 */
public class A213486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213486() {
    super(new long[] {-1, 4, -7, 8, -7, 4}, new long[] {0, 3, 12, 27, 48, 78});
  }
}
