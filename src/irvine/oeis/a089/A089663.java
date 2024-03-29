package irvine.oeis.a089;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A089663 a(n) = S1(n, 6), where S1(n, t) = Sum_{k=0..n} (k^t * Sum_{j=0..k} binomial(n,j)).
 * @author Sean A. Irvine
 */
public class A089663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089663() {
    super(new long[] {-256, 1024, -1792, 1792, -1120, 448, -112, 16}, new long[] {0, 2, 259, 6284, 77180, 646960, 4235864, 23313408});
  }
}
