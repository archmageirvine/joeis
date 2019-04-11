package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108946 <code>a(2n) =</code> A001570(n), <code>a(2n+1) =</code> -A007654(n+1).
 * @author Sean A. Irvine
 */
public class A108946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108946() {
    super(new long[] {1, 4, 0, -4}, new long[] {1, -3, 13, -48});
  }
}
