package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213785 <code>a(n) = Sum(P(i)*P(j), 1&lt;=i&lt;j&lt;=n)</code>, where <code>P(k)</code> is the k-th Pell number A000129(k).
 * @author Sean A. Irvine
 */
public class A213785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213785() {
    super(new long[] {-1, 5, 8, -20, 9}, new long[] {0, 0, 2, 17, 113});
  }
}
