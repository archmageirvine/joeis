package irvine.oeis.a209;

import irvine.oeis.LinearRecurrence;

/**
 * A209262 <code>a(n) = 1 + 2*n^2 + 3*n^3 + 4*n^4</code>.
 * @author Sean A. Irvine
 */
public class A209262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209262() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 10, 97, 424, 1249});
  }
}
