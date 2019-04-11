package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022270 <code>a(n) = n*(13*n - 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A022270 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022270() {
    super(new long[] {1, -3, 3}, new long[] {0, 6, 25});
  }
}
