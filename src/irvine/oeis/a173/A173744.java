package irvine.oeis.a173;
// Generated by gen_seq4.pl 2024-05-25/filnum at 2024-05-25 23:20

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A173744 Numbers n such that tau(phi(n))= phi(rad(n)).
 * @author Georg Fischer
 */
public class A173744 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A173744() {
    super(1, 1, k -> Functions.TAU.z(Functions.PHI.z(k)).equals(Functions.PHI.z(Jaguar.factor(k).squareFreeKernel())));
  }
}
