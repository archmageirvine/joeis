package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090314 a(n) = 23*a(n-1) + a(n-2), starting with a(0) = 2 and a(1) = 23.
 * @author Sean A. Irvine
 */
public class A090314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090314() {
    super(new long[] {1, 23}, new long[] {2, 23});
  }
}
