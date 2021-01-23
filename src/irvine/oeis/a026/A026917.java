package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026917 a(n) = Sum{T(i,j)}, 0&lt;=j&lt;=i, 0&lt;=i&lt;=n, T given by A026907.
 * @author Sean A. Irvine
 */
public class A026917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026917() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 27, 127, 399});
  }
}
