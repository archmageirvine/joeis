package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214731 <code>a(n) = n^3 - 2*n^2 - 1</code>.
 * @author Sean A. Irvine
 */
public class A214731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214731() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-2, -1, 8, 31});
  }
}
