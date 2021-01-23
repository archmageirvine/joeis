package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268344 a(n) = 11*a(n - 1) - 3*a(n - 2) for n&gt;1, a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A268344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268344() {
    super(new long[] {-3, 11}, new long[] {0, 1});
  }
}
