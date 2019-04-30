package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020698 <code>a(n) = 5*a(n-1) - 2*a(n-2)</code>, with <code>a(0)=2, a(1)=9</code>.
 * @author Sean A. Irvine
 */
public class A020698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020698() {
    super(new long[] {-2, 5}, new long[] {2, 9});
  }
}
