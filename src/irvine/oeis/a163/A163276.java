package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163276 a(n) = n^6*(n+1)^2/2.
 * @author Sean A. Irvine
 */
public class A163276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163276() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 2, 288, 5832, 51200, 281250, 1143072, 3764768, 10616832});
  }
}
