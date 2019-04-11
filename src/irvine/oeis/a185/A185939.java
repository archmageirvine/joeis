package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185939 <code>a(n) = 9*n^2 - 6*n + 2</code>.
 * @author Sean A. Irvine
 */
public class A185939 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185939() {
    super(new long[] {1, -3, 3}, new long[] {5, 26, 65});
  }
}
