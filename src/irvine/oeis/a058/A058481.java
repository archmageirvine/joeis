package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058481 <code>a(n) = 3^n - 2</code>.
 * @author Sean A. Irvine
 */
public class A058481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058481() {
    super(new long[] {-3, 4}, new long[] {1, 7});
  }
}
