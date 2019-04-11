package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247643 <code>a(n) = ( 10*n*(n+1)+(2*n+1)*(-1)^n+7 )/8</code>.
 * @author Sean A. Irvine
 */
public class A247643 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247643() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 3, 9, 15, 27});
  }
}
