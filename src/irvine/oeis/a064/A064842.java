package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064842 Maximal value of <code>Sum_{i=1..n} (p(i) - p(i+1))^2</code>, where <code>p(n+1) = p(1)</code>, as p ranges over all permutations of <code>{1, 2</code>, ..., <code>n}</code>.
 * @author Sean A. Irvine
 */
public class A064842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064842() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 2, 6, 18, 36});
  }
}
