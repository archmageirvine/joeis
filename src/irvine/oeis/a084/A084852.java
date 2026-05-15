package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A084852 Numbers k such that k^(k+1) + (k+1)^k - k(k+1) is prime.
 * @author Sean A. Irvine
 */
public class A084852 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A084852() {
    super(1, 2, k -> Z.valueOf(k).pow(k + 1).add(Z.valueOf(k + 1).pow(k)).subtract(k * (k + 1)).isProbablePrime());
  }
}
