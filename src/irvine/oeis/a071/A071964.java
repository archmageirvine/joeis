package irvine.oeis.a071;
// Generated by gen_seq4.pl 2024-05-27/filnum at 2024-05-28 02:23

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A071964 Numbers k such that k = Gpf(k) * Gpf(phi(k)) where Gpf(k) = A006530(k) is the greatest prime factor of k.
 * @author Georg Fischer
 */
public class A071964 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A071964() {
    super(1, 3, k -> Functions.GPF.z(k).multiply(Functions.GPF.z(Functions.PHI.z(k))).equals(Z.valueOf(k)));
  }
}
