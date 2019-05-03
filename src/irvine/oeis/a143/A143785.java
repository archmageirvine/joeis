package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143785 Antidiagonal sums of the triangle <code>A120070</code>.
 * @author Sean A. Irvine
 */
public class A143785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143785() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {3, 8, 20, 36, 63, 96});
  }
}
