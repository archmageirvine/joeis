package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099446 A Chebyshev transform of <code>A057083</code>.
 * @author Sean A. Irvine
 */
public class A099446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099446() {
    super(new long[] {-1, 3, -5, 3}, new long[] {1, 3, 5, 3});
  }
}
