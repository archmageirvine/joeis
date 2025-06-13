package irvine.oeis.a107;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A107126 Numbers n such that (10^(2n+1)+45*10^n-1)/9 is prime.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A107126 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A107126() {
    super(1, 0, k -> Z.TEN.pow(2L * k + 1).add(Z.TEN.pow(k).multiply(45).subtract(1)).divide(9).isProbablePrime());
  }
}
