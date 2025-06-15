package irvine.oeis.a183;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A183176 Numbers k such that (10^(2k+1) + 12*10^k - 1)/3 is prime.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A183176 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A183176() {
    super(1, 1, k -> Z.TEN.pow(2L * k + 1).add(Z.TEN.pow(k).multiply(12)).subtract(1).divide(3).isProbablePrime());
  }
}
