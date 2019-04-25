package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086026 <code>a(n) = Sum_{i=1..n} C(i+4,5)^3</code>.
 * @author Sean A. Irvine
 */
public class A086026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086026() {
    super(new long[] {1, -17, 136, -680, 2380, -6188, 12376, -19448, 24310, -24310, 19448, -12376, 6188, -2380, 680, -136, 17}, new long[] {1, 217, 9478, 185094, 2185470, 18188478, 116799606, 613592694, 2745339597L, 10769363605L, 37850444632L, 121189368664L, 358136205336L, 987118431768L, 2559344776920L, 6286103520984L, 14712254089533L});
  }
}
