package irvine.oeis.a188;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A188386 a(n) = numerator(H(n+2)-H(n-1)), where H(n) = Sum_{k=1..n} 1/k is the n-th harmonic number.
 * @author Sean A. Irvine
 */
public class A188386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188386() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {11, 13, 47, 37, 107, 73});
  }
}
