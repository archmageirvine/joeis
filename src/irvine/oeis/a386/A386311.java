package irvine.oeis.a386;

import irvine.oeis.FiniteSequence;

/**
 * A386311 a(1) = 2, a(n+1) is the largest prime p such that b(n+1) = b(n)*(p + a(n))/(p - a(n)) is a positive integer, where b(1) = 1.
 * @author Sean A. Irvine
 */
public class A386311 extends FiniteSequence {

  /** Construct the sequence. */
  public A386311() {
    super(1, FINITE, 2, 3, 13, 29, 71, 73, 3673, 3677, 1970327, 8879341, 30578677);
  }
}
