package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115067 <code>a(n) = (3*n^2 - n - 2)/2</code>.
 * @author Sean A. Irvine
 */
public class A115067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115067() {
    super(new long[] {1, -3, 3}, new long[] {0, 4, 11});
  }
}
