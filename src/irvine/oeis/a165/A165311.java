package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165311 a(0)=1, a(1)=4, a(n)=9*a(n-1)-16*a(n-2) for n&gt;1.
 * @author Sean A. Irvine
 */
public class A165311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165311() {
    super(new long[] {-16, 9}, new long[] {1, 4});
  }
}
