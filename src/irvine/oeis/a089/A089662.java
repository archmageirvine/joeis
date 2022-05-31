package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089662 a(n) = S1(n,5), where S1(n,t) = Sum_{k=0..n} k^t * Sum_{j=0..k} binomial(n,j).
 * @author Sean A. Irvine
 */
public class A089662 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089662() {
    super(new long[] {128, -448, 672, -560, 280, -84, 14}, new long[] {0, 2, 131, 2172, 20386, 138580, 763824});
  }
}
