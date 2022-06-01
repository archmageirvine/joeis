package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020698 a(n) = 5*a(n-1) - 2*a(n-2), with a(0)=2, a(1)=9.
 * @author Sean A. Irvine
 */
public class A020698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020698() {
    super(new long[] {-2, 5}, new long[] {2, 9});
  }
}
