package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290720 <code>a(n) = 2*3^n + 4^n + 3*n</code>.
 * @author Sean A. Irvine
 */
public class A290720 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290720() {
    super(new long[] {-12, 31, -27, 9}, new long[] {3, 13, 40, 127});
  }
}
