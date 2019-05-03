package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213501 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and w <code>!= max(|w-x|,|x-y|)</code>.
 * @author Sean A. Irvine
 */
public class A213501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213501() {
    super(new long[] {-1, 1, 2, -1, -2, -1, 2, 1}, new long[] {0, 4, 16, 45, 94, 172, 281, 433});
  }
}
