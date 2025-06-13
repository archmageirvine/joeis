package irvine.oeis.a107;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A107125 Numbers n such that (10^(2n+1) + 36*10^n - 1)/9 is prime.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A107125 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A107125() {
    super(1, 0, k -> Z.TEN.pow(2L * k + 1).add(Z.TEN.pow(k).multiply(36)).subtract(1).divide(9).isProbablePrime());
  }
}
