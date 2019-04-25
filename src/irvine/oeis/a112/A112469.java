package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112469 Partial sums of <code>(-1)^n*F(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A112469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112469() {
    super(new long[] {-1, 2, 0}, new long[] {1, 1, 2});
  }
}
