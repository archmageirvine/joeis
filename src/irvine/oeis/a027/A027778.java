package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027778 a(n) = 5*(n+1)*binomial(n+2, 5)/2.
 * @author Sean A. Irvine
 */
public class A027778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027778() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {10, 75, 315, 980, 2520, 5670, 11550});
  }
}
