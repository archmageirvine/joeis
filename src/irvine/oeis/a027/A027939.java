package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027939 <code>a(n) = T(2*n, n+3)</code>, T given by <code>A027935</code>.
 * @author Sean A. Irvine
 */
public class A027939 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027939() {
    super(new long[] {-1, 9, -34, 71, -90, 71, -34, 9}, new long[] {1, 29, 247, 1300, 5270, 18228, 56967, 166681});
  }
}
