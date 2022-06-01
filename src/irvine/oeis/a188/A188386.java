package irvine.oeis.a188;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A188386 Numerator(h(n+2)-h(n-1)), where h(n) is the n-th harmonic number sum(1/k, k=1..n).
 * @author Sean A. Irvine
 */
public class A188386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188386() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {11, 13, 47, 37, 107, 73});
  }
}
