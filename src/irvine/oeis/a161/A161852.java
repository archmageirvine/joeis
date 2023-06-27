package irvine.oeis.a161;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A161852 Solutions to the simultaneous equations m(n)+1=a(n)^2 and 7*m(n)+1=b(n)^2.
 * @author Sean A. Irvine
 */
public class A161852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161852() {
    super(1, new long[] {-1, 0, 16, 0}, new long[] {1, 5, 11, 79});
  }
}
