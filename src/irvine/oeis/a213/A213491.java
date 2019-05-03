package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213491 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and the numbers <code>w,x,y,|w-x|,|x-y|</code> not distinct.
 * @author Sean A. Irvine
 */
public class A213491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213491() {
    super(new long[] {1, 0, -1, -1, -1, 1, 1, 1, 0}, new long[] {1, 8, 27, 64, 125, 204, 305, 420, 569});
  }
}
