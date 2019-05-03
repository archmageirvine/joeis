package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212978 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and range <code>= 2*n-w-x</code>.
 * @author Sean A. Irvine
 */
public class A212978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212978() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {1, 5, 11, 20, 32});
  }
}
