package irvine.oeis.a069;

import irvine.oeis.FilterPositionSequence;

/**
 * A069781 Numbers k such that gcd(d(k^3), d(k)) is not a power of 2.
 * @author Sean A. Irvine
 */
public class A069781 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A069781() {
    super(1, 1, new A069780(), k -> k.bitCount() != 1);
  }
}

