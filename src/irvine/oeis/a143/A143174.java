package irvine.oeis.a143;

import irvine.oeis.FiniteSequence;

/**
 * A143174 <code>a(1)=1. a(n) =</code> smallest positive multiple of n such that |a(n)-a(n-1)| is prime.
 * @author Georg Fischer
 */
public class A143174 extends FiniteSequence {

  /** Construct the sequence. */
  public A143174() {
    super(1, 4, 6, 4, 15, 12, 7, 24, 27, 10, 33, 36, 13, 42, 45, 16, 119, 18, 209, 60, 63, 22, 69, 72, 25, 78, 81, 28, 87, 90, 31, 128, 99, 68, 70, 72, 74, 76, 39, 80, 82, 84, 43, 132, 135, 46, 329, 48, 245, 250, 51, 104, 106, 108, 55, 168, 171, 58, 767, 120, 61, 372);
  }
}
