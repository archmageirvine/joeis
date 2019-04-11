package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153773 <code>a(2*n) = 3*a(2*n-1) - 1, a(2*n+1) = 3*a(2*n),</code> with <code>a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A153773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153773() {
    super(new long[] {-3, 1, 3}, new long[] {1, 2, 6});
  }
}
