package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080877 <code>a(n)*a(n+3) - a(n+1)*a(n+2) = 2^n,</code> given <code>a(0)=1, a(1)=1, a(2)=2</code>.
 * @author Sean A. Irvine
 */
public class A080877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080877() {
    super(new long[] {-4, 0, 6, 0}, new long[] {1, 1, 2, 3});
  }
}
