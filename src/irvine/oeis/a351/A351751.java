package irvine.oeis.a351;
// Generated by gen_seq4.pl 2024-02-07/lambdan at 2024-02-07 14:25

import irvine.factor.factor.Jaguar;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A351751 a(n) = Sum_{p|n, p prime} p^sigma_p(p).
 * @author Georg Fischer
 */
public class A351751 extends LambdaSequence {

  /** Construct the sequence. */
  public A351751() {
    super(1, n -> Integers.SINGLETON.sopf(n, p -> Z.valueOf(p).pow(Jaguar.factor(p).sigma(p).intValueExact())));
  }
}
