package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213497 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and w <code>= min(|w-x|,|x-y|)</code>.
 * @author Sean A. Irvine
 */
public class A213497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213497() {
    super(new long[] {1, 0, -2, -1, 1, 2, 0}, new long[] {1, 4, 10, 17, 29, 40, 57});
  }
}
