package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213484 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and <code>|w-x|+|x-y|+|y-w| &gt;= w+x+y</code>.
 * @author Sean A. Irvine
 */
public class A213484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213484() {
    super(new long[] {1, -3, 4, -4, 3}, new long[] {1, 4, 7, 10, 16});
  }
}
