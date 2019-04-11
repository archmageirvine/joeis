package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185212 <code>a(n) = 12*n^2 - 8*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A185212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185212() {
    super(new long[] {1, -3, 3}, new long[] {1, 5, 33});
  }
}
