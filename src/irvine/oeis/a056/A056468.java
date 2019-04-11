package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056468 <code>a(n) =</code> sum(k=1,n, k^6*binomial(n,k)).
 * @author Sean A. Irvine
 */
public class A056468 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056468() {
    super(new long[] {128, -448, 672, -560, 280, -84, 14}, new long[] {0, 1, 66, 924, 7400, 44040, 217392});
  }
}
