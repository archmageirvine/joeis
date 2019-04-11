package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027801 <code>a(n) =</code> 5*(n+1)*binomial(n+4,5)/2.
 * @author Sean A. Irvine
 */
public class A027801 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027801() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {5, 45, 210, 700, 1890, 4410, 9240});
  }
}
