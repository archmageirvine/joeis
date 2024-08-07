package irvine.oeis.a367;
// Generated by gen_seq4.pl 2024-07-21/lambdan at 2024-07-22 00:06

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A367865 a(n) = Sum_{d|n} d * phi(d) * mu(d)^2.
 * @author Georg Fischer
 */
public class A367865 extends LambdaSequence {

  /** Construct the sequence. */
  public A367865() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Z.valueOf(d).multiply(Functions.PHI.z(d).multiply(Functions.MOEBIUS.z(d).square()))));
  }
}
