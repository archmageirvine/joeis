package irvine.oeis.a069;

import irvine.math.z.Z;

/**
 * A069617 a(1) = 5; a(2n) = smallest prime that is a right concatenation of a(2n-1) and a number with no insignificant zeros and a(2n+1) = smallest prime ending in ( the least significant digits) a(2n-1). Alternate left and right concatenation yielding primes.
 * @author Sean A. Irvine
 */
public class A069617 extends A069613 {

  /** Construct the sequence. */
  public A069617() {
    super(Z.FIVE);
  }
}
