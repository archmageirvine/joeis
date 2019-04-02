package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099457 A Chebyshev transform of A099456 associated to the knot 9_44.
 * @author Sean A. Irvine
 */
public class A099457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099457() {
    super(new long[] {-1, 4, -7, 4}, new long[] {1, 4, 10, 16});
  }
}
