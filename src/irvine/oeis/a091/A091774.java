package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091774 G.f.: Product((1+x^i)/(1-x^i),i=1..n-1)/(1-x^n), with <code>n = 6</code>.
 * @author Sean A. Irvine
 */
public class A091774 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091774() {
    super(new long[] {-1, 3, -3, 3, -6, 7, -6, 6, -6, 7, -6, 3, -3, 3}, new long[] {1, 2, 4, 8, 14, 24, 39, 60, 90, 132, 188, 262, 359, 482});
  }
}
