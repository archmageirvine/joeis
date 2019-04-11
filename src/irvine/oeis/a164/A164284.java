package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164284 <code>a(n) = 15*n-7</code>.
 * @author Sean A. Irvine
 */
public class A164284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164284() {
    super(new long[] {-1, 2}, new long[] {8, 23});
  }
}
