package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101891 Sum <code>C(n</code>,2k)F(k+1), <code>k=0..floor(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A101891 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101891() {
    super(new long[] {1, 2, -5, 4}, new long[] {1, 1, 2, 4});
  }
}
