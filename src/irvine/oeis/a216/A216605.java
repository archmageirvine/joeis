package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216605 a(n) is equal to the rational part (considering of the ring Z(sqrt(13))) of the numbers A(n) = ((sqrt(13) - 1)/2)*A(n-1) + A(n-2) + ((3-sqrt(13))/2)*A(n-3), with A(0) = 6, A(1) = sqrt(13) - 1, and A(2) = 11 - sqrt(13).
 * @author Sean A. Irvine
 */
public class A216605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216605() {
    super(new long[] {1, -3, -6, 4, 5, -1}, new long[] {6, -1, 11, -4, 31, -16});
  }
}
