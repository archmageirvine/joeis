package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089661 a(n) = S1(n,4), where S1(n,t) = Sum_{k=0..n} k^t * Sum_{j=0..k} binomial(n,j).
 * @author Sean A. Irvine
 */
public class A089661 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089661() {
    super(new long[] {-64, 192, -240, 160, -60, 12}, new long[] {0, 2, 67, 764, 5492, 30304});
  }
}
