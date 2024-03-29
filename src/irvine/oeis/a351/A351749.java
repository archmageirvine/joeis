package irvine.oeis.a351;
// Generated by gen_seq4.pl 2024-02-07/lambdan at 2024-02-07 14:25

import irvine.factor.factor.Jaguar;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A351749 a(n) = Sum_{p|n, p prime} sigma_p(p).
 * @author Georg Fischer
 */
public class A351749 extends LambdaSequence {

  /** Construct the sequence. */
  public A351749() {
    super(1, n -> Integers.SINGLETON.sopf(n, p -> Jaguar.factor(p).sigma(p)));
  }
}
