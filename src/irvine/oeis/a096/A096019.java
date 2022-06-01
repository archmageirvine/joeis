package irvine.oeis.a096;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A096019 a(0)=3, a(n) = 3*a(n-1) + 2*(-1)^n.
 * @author Sean A. Irvine
 */
public class A096019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096019() {
    super(new long[] {3, 2}, new long[] {3, 7});
  }
}
