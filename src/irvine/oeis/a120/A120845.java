package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120845 <code>2^n+3^n+5*n</code>.
 * @author Sean A. Irvine
 */
public class A120845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120845() {
    super(new long[] {-6, 17, -17, 7}, new long[] {2, 10, 23, 50});
  }
}
