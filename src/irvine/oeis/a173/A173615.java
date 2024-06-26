package irvine.oeis.a173;
// Generated by gen_seq4.pl 2024-05-25/filnum at 2024-05-25 23:20

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A173615 Numbers n such that rad(n)^2 divides sigma(n).
 * @author Georg Fischer
 */
public class A173615 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A173615() {
    super(1, 1, k -> Functions.SIGMA1.z(k).mod(Jaguar.factor(k).squareFreeKernel().square()).isZero());
  }
}
