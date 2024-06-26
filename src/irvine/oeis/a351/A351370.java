package irvine.oeis.a351;
// Generated by gen_seq4.pl 2024-02-07/lambdan at 2024-02-07 14:25

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A351370 a(n) = Sum_{p|n, p prime} p^prime(p).
 * @author Georg Fischer
 */
public class A351370 extends LambdaSequence {

  /** Construct the sequence. */
  public A351370() {
    super(1, n -> Integers.SINGLETON.sopf(n, p -> Z.valueOf(p).pow(Functions.PRIME.l(p))));
  }
}
