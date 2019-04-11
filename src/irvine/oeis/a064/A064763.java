package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064763 <code>a(n) = 28*n^2</code>.
 * @author Sean A. Irvine
 */
public class A064763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064763() {
    super(new long[] {1, -3, 3}, new long[] {0, 28, 112});
  }
}
