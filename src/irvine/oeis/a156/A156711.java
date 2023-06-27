package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156711 a(n) = 144*n^2 - 161*n + 45.
 * @author Sean A. Irvine
 */
public class A156711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156711() {
    super(1, new long[] {1, -3, 3}, new long[] {28, 299, 858});
  }
}
