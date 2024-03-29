package irvine.oeis.a359;
// Generated by gen_seq4.pl 2024-01-15/filamb at 2024-01-26 21:00

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FilterLambdaSequence;

/**
 * A359822 Numbers k whose arithmetic derivative, A003415(k), has the same parity as k.
 * @author Georg Fischer
 */
public class A359822 extends FilterLambdaSequence {

  /** Construct the sequence. */
  public A359822() {
    super(1, 0, k -> Jaguar.factor(k).arithmeticDerivative().and(Z.ONE).equals(k.and(Z.ONE)));
  }
}
