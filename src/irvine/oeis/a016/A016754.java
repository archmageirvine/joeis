package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016754 Odd squares: <code>a(n) = (2n+1)^2.</code> Also centered octagonal numbers.
 * @author Sean A. Irvine
 */
public class A016754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016754() {
    super(new long[] {1, -3, 3}, new long[] {1, 9, 25});
  }
}
