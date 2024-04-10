package irvine.oeis.a371;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A371474 Numbers k such that binomial(k^2,k) == 0 (mod k^3).
 * @author Georg Fischer
 */
public class A371474 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A371474() {
    super(1, 1, k -> {
      final Z z = Z.valueOf(k);
      return Binomial.binomial(z.square(), z).mod(z.pow(3)).isZero();
    });
  }
}
