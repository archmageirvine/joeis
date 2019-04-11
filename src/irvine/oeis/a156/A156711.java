package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156711 <code>a(n) = 144*n^2 - 161*n + 45</code>.
 * @author Sean A. Irvine
 */
public class A156711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156711() {
    super(new long[] {1, -3, 3}, new long[] {28, 299, 858});
  }
}
