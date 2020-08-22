package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063727 a(n) = 2*a(n-1) + 4*a(n-2), a(0)=1, a(1)=2.
 * @author Sean A. Irvine
 */
public class A063727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063727() {
    super(new long[] {4, 2}, new long[] {1, 2});
  }
}
