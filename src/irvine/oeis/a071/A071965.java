package irvine.oeis.a071;
// Generated by gen_seq4.pl 2024-05-27/filnum at 2024-05-28 02:23

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A071965 Numbers k such that k = Gpf(k) * Gpf(sigma(k)) where Gpf(k) = A006530(k) is the greatest prime factor of k.
 * @author Georg Fischer
 */
public class A071965 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A071965() {
    super(1, 2, k -> Functions.GPF.z(k).multiply(Functions.GPF.z(Functions.SIGMA.z(k))).equals(Z.valueOf(k)));
  }
}
