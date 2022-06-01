package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108946 a(2n) = A001570(n), a(2n+1) = -A007654(n+1).
 * @author Sean A. Irvine
 */
public class A108946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108946() {
    super(new long[] {1, 4, 0, -4}, new long[] {1, -3, 13, -48});
  }
}
