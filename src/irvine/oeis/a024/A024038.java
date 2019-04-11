package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024038 <code>a(n) = 4^n - n^2</code>.
 * @author Sean A. Irvine
 */
public class A024038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024038() {
    super(new long[] {-4, 13, -15, 7}, new long[] {1, 3, 12, 55});
  }
}
