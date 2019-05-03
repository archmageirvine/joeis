package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027001 <code>a(n) = T(2*n, n+2)</code>, T given by <code>A026998</code>.
 * @author Sean A. Irvine
 */
public class A027001 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027001() {
    super(new long[] {-1, 7, -19, 26, -19, 7}, new long[] {1, 26, 174, 743, 2552, 7784});
  }
}
