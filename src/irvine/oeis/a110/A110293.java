package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110293 a(2*n) = A001570(n), a(2*n+1) = A011943(n+1).
 * @author Sean A. Irvine
 */
public class A110293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110293() {
    super(new long[] {-1, 0, 14, 0}, new long[] {1, 7, 13, 97});
  }
}
