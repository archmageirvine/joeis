package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213480 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and <code>|w-x|+|x-y| != w+x+y</code>.
 * @author Sean A. Irvine
 */
public class A213480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213480() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 4, 16, 46, 95, 175});
  }
}
