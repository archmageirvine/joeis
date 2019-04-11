package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213788 <code>a(n) =</code> Sum_{1&lt;=i&lt;j&lt;k&lt;=n} (P(i)*P(j)*P(k), where P(m) is the k-th Pell number A000129(m).
 * @author Sean A. Irvine
 */
public class A213788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213788() {
    super(new long[] {-1, -7, 98, -62, -532, 616, -34, -98, 21}, new long[] {0, 0, 0, 10, 214, 3491, 52001, 748788, 10636260});
  }
}
