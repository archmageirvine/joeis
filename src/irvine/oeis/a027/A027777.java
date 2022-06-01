package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027777 a(n) = 2*(n+1)*binomial(n+2,4).
 * @author Sean A. Irvine
 */
public class A027777 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027777() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {6, 40, 150, 420, 980, 2016});
  }
}
