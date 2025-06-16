package irvine.oeis.a183;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A183187 Numbers k such that 10^(2k+1)-10^k-1 is prime.
 * @author Sean A. Irvine
 */
public class A183187 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A183187() {
    super(1, 1, k -> Z.TEN.pow(2L * k + 1).subtract(Z.TEN.pow(k)).subtract(1).isProbablePrime());
  }
}
