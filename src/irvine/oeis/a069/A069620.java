package irvine.oeis.a069;

import irvine.math.z.Z;

/**
 * A069620 a(1) = 8; a(2n) = smallest prime that is a right concatenation of a(2n-1) and a number with no insignificant zeros and a(2n+1) = smallest prime ending in ( the least significant digits) a(2n-1). Alternate left and right concatenation yielding primes.
 * @author Sean A. Irvine
 */
public class A069620 extends A069613 {

  /** Construct the sequence. */
  public A069620() {
    super(Z.EIGHT);
  }
}
