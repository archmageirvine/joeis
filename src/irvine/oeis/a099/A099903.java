package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099903 Sum of all matrix elements of n X n matrix M(i,j) = i^3+j^3, (i,j = 1..n). a(n) = n^3*(n+1)^2/2.
 * @author Sean A. Irvine
 */
public class A099903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099903() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {2, 36, 216, 800, 2250, 5292});
  }
}
