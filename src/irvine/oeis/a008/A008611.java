package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008611 <code>a(n) = a(n-3) + 1,</code> with <code>a(0)=a(2)=1, a(1)=0</code>.
 * @author Sean A. Irvine
 */
public class A008611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008611() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 0, 1, 2});
  }
}

