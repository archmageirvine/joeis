package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174619 a(n) = A174618(n)+A174618(n+1).
 * @author Sean A. Irvine
 */
public class A174619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174619() {
    super(new long[] {1, 0, 0, 0, -1, 0, 2, 0}, new long[] {1, 1, 1, 2, 2, 3, 3, 4});
  }
}
