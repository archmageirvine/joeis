package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157731 <code>a(n) = 18522*n - 10248</code>.
 * @author Sean A. Irvine
 */
public class A157731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157731() {
    super(new long[] {-1, 2}, new long[] {8274, 26796});
  }
}
