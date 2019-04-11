package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081342 <code>a(n) = (8^n + 2^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A081342 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081342() {
    super(new long[] {-16, 10}, new long[] {1, 5});
  }
}
