package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090198 a(n) = N(5,n), where N(5,x) is the 5th Narayana polynomial.
 * @author Sean A. Irvine
 */
public class A090198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090198() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 42, 197, 562, 1257});
  }
}
