package irvine.oeis.a183;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A183182 Numbers k such that (7*10^(2*k+1) + 9*10^k - 7)/9 is prime.
 * @author Sean A. Irvine
 */
public class A183182 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A183182() {
    super(1, 1, k -> Z.TEN.pow(2L * k + 1).multiply(7).add(Z.TEN.pow(k).multiply(9)).subtract(7).divide(9).isProbablePrime());
  }
}
