package irvine.oeis.a069;

import irvine.math.z.Z;

/**
 * A069615 a(1) = 3; a(2n) = smallest prime starting (in the most significant digits) with a(2n-1) (i.e., as a right concatenation of a(2n-1) and a number with no insignificant zeros); a(2n+1) = smallest prime ending in (the least significant digits) a(2n-1). Alternate left and right concatenation yielding primes.
 * @author Sean A. Irvine
 */
public class A069615 extends A069613 {

  /** Construct the sequence. */
  public A069615() {
    super(Z.THREE);
  }
}
