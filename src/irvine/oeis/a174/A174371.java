package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174371 <code>a(n) = (6*n-1)^2</code>.
 * @author Sean A. Irvine
 */
public class A174371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174371() {
    super(new long[] {1, -3, 3}, new long[] {1, 25, 121});
  }
}
